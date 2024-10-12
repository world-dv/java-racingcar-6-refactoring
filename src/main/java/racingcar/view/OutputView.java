package racingcar.view;

public class OutputView {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void printMessage(PrintMessage printMessage) {
        System.out.println(printMessage.getMessage());
    }

    public static void printCarNameInput() {
        printMessage(PrintMessage.NAME_INPUT_MESSAGE);
    }

    public static void printCarMoveCount() {
        printMessage(PrintMessage.TRY_INPUT_MESSAGE);
    }

    public static void printResult() {
        printMessage(PrintMessage.RESULT_MESSAGE);
    }

    public static void printWinner() {
        printMessage(PrintMessage.WINNER_MESSAGE);
    }
}
