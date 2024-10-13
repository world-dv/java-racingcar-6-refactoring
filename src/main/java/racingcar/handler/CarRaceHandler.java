package racingcar.handler;

import racingcar.util.MoveCar;
import racingcar.util.Number;

import java.util.LinkedHashSet;

public class CarRaceHandler {

    private final LinkedHashSet<String> winners;
    private final LinkedHashSet<MoveCar> moveCars;
    private Integer winnerAdvance;

    public CarRaceHandler(LinkedHashSet<MoveCar> moveCars) {
        this.winners = new LinkedHashSet<>();
        this.moveCars = moveCars;
        this.winnerAdvance = Number.magicNumber(Number.ZERO);
    }

    public void makeMoveCar(Integer move) {
        for (int moveCount = 0; moveCount < move; moveCount++) {
            moveCars.forEach(MoveCar::move);
            OutputHandler.printLineSpace();
        }
    }

    public LinkedHashSet<String> findMaxAdvanceCarName() {
        for (MoveCar car : moveCars) {
            updateWinnerAdvance(car);
            updateEqualWinnerAdvance(car);
        }
        return winners;
    }

    public void updateEqualWinnerAdvance(MoveCar car) {
        if (compareEqualAdvance(car)) {
            addWinner(car);
        }
    }

    public void updateWinnerAdvance(MoveCar car) {
        if (compareAdvance(car)) {
            setWinnerAdvance(car);
            removeAllWinner();
            addWinner(car);
        }
    }

    public boolean compareEqualAdvance(MoveCar car) {
        return winnerAdvance.equals(car.getCarAdvance());
    }

    public boolean compareAdvance(MoveCar car) {
        return winnerAdvance < car.getCarAdvance();
    }

    public void setWinnerAdvance(MoveCar car) {
        winnerAdvance = car.getCarAdvance();
    }

    public void removeAllWinner() {
        winners.clear();
    }

    public void addWinner(MoveCar car) {
        winners.add(car.getCarName());
    }
}
