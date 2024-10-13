package racingcar.util;

import racingcar.domain.Car;
import racingcar.handler.OutputHandler;

public class MoveCar {

    private final Car car;

    public MoveCar(String name) {
        this.car = new Car(name);
    }

    public void move() {
        if (MakeMove.checkMoveOrStop()) {
            car.addAdvance();
        }
        OutputHandler.printCarRaceResult(car);
    }

    public String getCarName() {
        return car.getCarName();
    }

    public Integer getCarAdvance() {
        return car.getAdvance();
    }
}
