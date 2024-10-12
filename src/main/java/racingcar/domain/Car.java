package racingcar.domain;

import racingcar.exception.ExceptionMessage;

public class Car {

    private final String carName;
    private Long advance;

    public Car(String carName) {
        if (checkCarName5Limit(carName)) {
            throw new IllegalArgumentException(ExceptionMessage.CAR_NAME_EXCEPTION.getMessage());
        }
        this.carName = carName;
        this.advance = 0L;
    }

    public boolean checkCarName5Limit(String carName) {
        return carName == null || carName.length() > 5;
    }

    public void addAdvance() {
        this.advance = advance + 1;
    }

    public String getCarName() {
        return carName;
    }

    public Long getAdvance() {
        return advance;
    }
}
