package racingcar.handler;

import racingcar.util.MoveCar;
import racingcar.view.InputView;

import java.util.HashSet;
import java.util.List;

public class InputHandler {

    public static List<MoveCar> makeCarsToMoveCar() {
        return InputView.inputCars().stream().map(MoveCar::new).toList();
    }

    public static HashSet<MoveCar> makeCars() {
        return new HashSet<>(makeCarsToMoveCar());
    }

    public static Integer makeMoveToInteger(String move) {
        return Integer.parseInt(move);
    }

    public static Integer makeMove() {
        return makeMoveToInteger(InputView.input());
    }
}
