package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class MakeMove {

    public static Integer makeMoveNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public static boolean checkMoveOrStop() {
        return makeMoveNumber() >= 4;
    }
}
