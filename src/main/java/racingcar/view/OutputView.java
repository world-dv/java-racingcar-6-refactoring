package racingcar.view;

public class OutputView {

    public static void print(PrintMessage printMessage) {
        System.out.println(printMessage.getMessage());
    }

    public static void printCarNameInput() {
        print(PrintMessage.NAME_INPUT_MESSAGE);
    }

    public static void printCarMoveCount() {
        print(PrintMessage.TRY_INPUT_MESSAGE);
    }

    public static void printResult() {
        print(PrintMessage.RESULT_MESSAGE);
    }

    public static void printWinner() {
        print(PrintMessage.WINNER_MESSAGE);
    }
}
