package lotto.domain;

import java.util.List;

public class LottoResults {

    private final List<LottoResult> lottoResults;

    public LottoResults(final List<LottoResult> lottoResults) {
        this.lottoResults = lottoResults;
    }

    public WinningStatistics getWinningStatistics() {
        return new WinningStatistics(lottoResults);
    }

    public List<LottoResult> getLottoResults() {
        return this.lottoResults;
    }
}
