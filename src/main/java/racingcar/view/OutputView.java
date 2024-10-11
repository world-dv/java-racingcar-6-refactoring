package racingcar.view;

public class OutputView {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void printCarNameInput() {
        print(PrintMessage.NAME_INPUT_MESSAGE.getMessage());
    }

    public static void printCarMoveCount() {
        print(PrintMessage.TRY_INPUT_MESSAGE.getMessage());
    }

    public static void printResult() {
        print(PrintMessage.RESULT_MESSAGE.getMessage());
    }

    public static void printWinner() {
        print(PrintMessage.WINNER_MESSAGE.getMessage());
    }
}
