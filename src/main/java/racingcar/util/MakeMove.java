package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class MakeMove {

    public static Integer makeMoveNumber() {
        return Randoms.pickNumberInRange(Number.magicNumber(Number.ZERO), Number.magicNumber(Number.NINE));
    }

    public static boolean checkMoveOrStop() {
        return makeMoveNumber() >= Number.magicNumber(Number.FOUR);
    }
}
