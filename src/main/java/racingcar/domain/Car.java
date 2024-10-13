package racingcar.domain;

import racingcar.exception.ExceptionMessage;
import racingcar.util.Number;

public class Car {

    private final String carName;
    private Integer advance;

    public Car(String carName) {
        if (checkCarName5Limit(carName)) {
            throw new IllegalArgumentException(ExceptionMessage.CAR_NAME_EXCEPTION.getMessage());
        }
        if (checkCarNameContainExtraChar(carName)) {
            throw new IllegalArgumentException(ExceptionMessage.CAR_INPUT_EXCEPTION.getMessage());
        }

        this.carName = carName;
        this.advance = Number.magicNumber(Number.ZERO);
    }

    public boolean checkCarName5Limit(String carName) {
        return carName == null || carName.length() > Number.magicNumber(Number.FIVE);
    }

    public boolean checkCarNameContainExtraChar(String carName) {
        return carName.matches(".*[^a-zA-Z0-9ㄱ-ㅎㅏ-ㅣ가-힣].*");
    }

    public void addAdvance() {
        this.advance = advance + Number.magicNumber(Number.ONE);
    }

    public String getCarName() {
        return carName;
    }

    public Integer getAdvance() {
        return advance;
    }
}
