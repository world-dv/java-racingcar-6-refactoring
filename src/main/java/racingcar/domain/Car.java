package racingcar.domain;

import racingcar.exception.ExceptionMessage;

public class Car {

    private final String carName;
    private final Long advance;

    public Car(String carName, Long advance) {
        if (checkCarName5Limit(carName)) {
            throw new IllegalArgumentException(ExceptionMessage.CAR_NAME_EXCEPTION.getMessage());
        }
        this.carName = carName;
        this.advance = advance;
    }

    public boolean checkCarName5Limit(String carName) {
        return carName == null || carName.length() > 5;
    }

    public String getCarName() {
        return carName;
    }

    public Long getAdvance() {
        return advance;
    }
}
