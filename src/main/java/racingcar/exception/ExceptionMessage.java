package racingcar.exception;

public enum ExceptionMessage {

    CAR_INPUT_EXCEPTION("자동차 이름은 ','로 구분해야 합니다."),
    CAR_NAME_EXCEPTION("자동차 이름은 5자리 이하만 가능합니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
