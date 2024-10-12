package racingcar.view;

public class OutputView {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void printSpace() {
        System.out.println();
    }

    public static void printMessage(PrintMessage printMessage) {
        System.out.println(printMessage.getMessage());
    }

    public static void printMessageOneLine(PrintMessage message) {
        System.out.print(message.getMessage());
    }
}
