package racingcar.exception;

import racingcar.handler.InputHandler;

public class InputException {

    public static void throwException(ExceptionMessage message) {
        throw new IllegalArgumentException(message.getMessage());
    }

    public static Integer catchNumericException(String move) {
        try {
            return InputHandler.makeMoveToInteger(move);
        } catch (NumberFormatException e) {
            InputException.throwException(ExceptionMessage.CAR_MOVE_EXCEPTION);
        }
        return null;
    }
}
