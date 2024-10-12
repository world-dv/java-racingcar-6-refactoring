package racingcar.domain;

import racingcar.exception.ExceptionMessage;

public class Car {

    private final String carName;
    private final Long tryCount;

    public Car(String carName, Long tryCount) {
        if (checkCarName5Limit()) {
            throw new IllegalArgumentException(ExceptionMessage.CAR_NAME_EXCEPTION.getMessage());
        }
        this.carName = carName;
        this.tryCount = tryCount;
    }

    public boolean checkCarName5Limit() {
        return carName == null || carName.length() > 5;
    }

    public String getCarName() {
        return carName;
    }

    public Long getTryCount() {
        return tryCount;
    }
}
