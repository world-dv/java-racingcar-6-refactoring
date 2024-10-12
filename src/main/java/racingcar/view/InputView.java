package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.util.MoveCar;

import java.util.HashSet;
import java.util.List;

public class InputView {

    public static String input() {
        return Console.readLine();
    }

    public static HashSet<String> inputCars() {
        return new HashSet<>(List.of(input().split(",")));
    }
}
