package racingcar.util;

public enum Number {

    ZERO(0),
    ONE(1),
    FOUR(4),
    FIVE(5),
    NINE(9);

    private final Integer magicNumber;

    Number(Integer magicNumber) {
        this.magicNumber = magicNumber;
    }

    public Integer getMagicNumber() {
        return magicNumber;
    }

    public static Integer magicNumber(Number number) {
        return number.getMagicNumber();
    }
}
