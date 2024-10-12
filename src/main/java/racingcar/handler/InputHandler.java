package racingcar.handler;

import racingcar.util.MoveCar;
import racingcar.view.InputView;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class InputHandler {

    public static HashSet<String> inputCars() {
        return new HashSet<>(trimCarName());
    }

    public static List<String> trimCarName() {
        return splitCarName().stream().map(String::trim).toList();
    }

    public static List<String> splitCarName() {
        return List.of(InputView.input().split(","));
    }

    public static List<MoveCar> makeCarsToMoveCar() {
        return inputCars().stream().map(MoveCar::new).toList();
    }

    public static LinkedHashSet<MoveCar> makeCars() {
        return new LinkedHashSet<>(makeCarsToMoveCar());
    }

    public static Integer makeMoveToInteger(String move) {
        return Integer.parseInt(move);
    }

    public static Integer makeMove() {
        return makeMoveToInteger(InputView.input());
    }
}
