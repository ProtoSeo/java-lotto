package lotto.view;

import java.util.Scanner;

import lotto.exception.InputMachTypeException;
import lotto.message.ErrorMessage;

public class LottoInputView {

	private static final String BUY_MONEY_MESSAGE = "구입금액을 입력해 주세요.";
	public static final String MANUAL_LOTTO_COUNT_MESSAGE = "수등으로 구매할 로또 수를 입력해 주세요.";
	private static final String LAST_WEEK_WIN_NUMBER_MESSAGE = "지난 주 당첨 번호를 입력해 주세요.";
	private static final String BONUS_BALL_MESSAGE = "보너스 볼을 입력해 주세요.";
	private static final Scanner scanner = new Scanner(System.in);

	private LottoInputView() {
	}

	public static int inputLottoPurchaseMoney() {
		System.out.println(BUY_MONEY_MESSAGE);
		return inputScannerTypeInteger();
	}

	public static int inputManualLottoCount() {
		System.out.println(MANUAL_LOTTO_COUNT_MESSAGE);
		return inputScannerTypeInteger();
	}

	public static String inputLastWinningLotto() {
		System.out.println(LAST_WEEK_WIN_NUMBER_MESSAGE);
		return scanner.nextLine();
	}

	public static int inputBonusNumber() {
		System.out.println(BONUS_BALL_MESSAGE);
		return inputScannerTypeInteger();
	}

	private static int inputScannerTypeInteger() {
		if (!scanner.hasNextInt()) {
			throw new InputMachTypeException(ErrorMessage.NUMBER_TYPE_ERROR_MESSAGE);
		}
		return Integer.parseInt(scanner.nextLine());
	}
}
