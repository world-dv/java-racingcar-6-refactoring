package racingcar.domain;

public class Car {

    private final String carName;
    private final Long tryCount;

    public Car(String carName, Long tryCount) {
        this.carName = carName;
        this.tryCount = tryCount;
    }

    public String getCarName() {
        return carName;
    }

    public Long getTryCount() {
        return tryCount;
    }
}
