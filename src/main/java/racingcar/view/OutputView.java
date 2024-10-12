package racingcar.view;

public class OutputView {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void printOneLine(String message) {
        System.out.print(message);
    }

    public static void printSpace() {
        System.out.println();
    }

    public static void printMessage(PrintMessage printMessage) {
        System.out.println(printMessage.getMessage());
    }
}
