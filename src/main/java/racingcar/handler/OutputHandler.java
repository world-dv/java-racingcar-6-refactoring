package racingcar.handler;

import racingcar.domain.Car;
import racingcar.view.OutputView;
import racingcar.view.PrintMessage;

import java.util.LinkedHashSet;

public class OutputHandler {

    public static void printCarNameInput() {
        OutputView.printMessage(PrintMessage.NAME_INPUT_MESSAGE);
    }

    public static void printCarMoveCount() {
        OutputView.printMessage(PrintMessage.TRY_INPUT_MESSAGE);
    }

    public static void printResult() {
        OutputView.printMessage(PrintMessage.RESULT_MESSAGE);
    }

    public static void printWinner() {
        OutputView.printMessageOneLine(PrintMessage.WINNER_MESSAGE);
    }

    public static String printCarMove(Car moveCar) {
        return "-".repeat(moveCar.getAdvance());
    }

    public static String printCarRaceWinner(LinkedHashSet<String> carNames) {
        return carNames.toString().replaceAll("[\\['\\]]", "");
    }

    public static void printCarRaceWinnerList(LinkedHashSet<String> carNames) {
        OutputView.print(printCarRaceWinner(carNames));
    }

    public static String printCarMoveResult(Car moveCar) {
        return String.format("%s : %s", moveCar.getCarName(), printCarMove(moveCar));
    }

    public static void printCarRaceResult(Car moveCar) {
        OutputView.print(printCarMoveResult(moveCar));
    }

    public static void printLineSpace() {
        OutputView.printSpace();
    }
}
