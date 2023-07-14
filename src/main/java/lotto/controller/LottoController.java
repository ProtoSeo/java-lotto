package lotto.controller;

import lotto.domain.BoughtLottos;
import lotto.domain.LottoBuyCount;
import lotto.domain.LottoGenerator;
import lotto.domain.Money;
import lotto.domain.WinningLotto;
import lotto.view.BoughtLottosWriter;
import lotto.view.LottoReader;
import lotto.view.MoneyReader;
import lotto.view.WinningStatisticsWriter;

public class LottoController {

    private final MoneyReader moneyReader;
    private final LottoReader lottoReader;
    private final BoughtLottosWriter boughtLottosWriter;
    private final WinningStatisticsWriter winningStatisticsWriter;

    public LottoController(
            final MoneyReader moneyReader,
            final LottoReader lottoReader,
            final BoughtLottosWriter boughtLottosWriter,
            final WinningStatisticsWriter winningStatisticsWriter
    ) {
        this.moneyReader = moneyReader;
        this.lottoReader = lottoReader;
        this.boughtLottosWriter = boughtLottosWriter;
        this.winningStatisticsWriter = winningStatisticsWriter;
    }

    public void startLotto() {
        try {
            run();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void run() {
        final Money money = moneyReader.readMoney();
        final LottoBuyCount lottoBuyCount = lottoReader.readManualLottoBuyCount();
        money.validateCanPurchaseLottoWantedCount(lottoBuyCount);

        final BoughtLottos manualBoughtLottos = lottoReader.readManualLottos(lottoBuyCount);
        final BoughtLottos autoBoughtLottos = new LottoGenerator()
                .generate(money.receiveAfterPurchaseLotto(lottoBuyCount));
        boughtLottosWriter.printBoughtLottos(manualBoughtLottos, autoBoughtLottos);

        final WinningLotto winningLotto = lottoReader.readWinningLotto();
        winningStatisticsWriter.printLottoStatistics(
                boughtLottos.winningResults(winningLotto)
        );
    }
}
