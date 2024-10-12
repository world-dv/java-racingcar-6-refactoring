package racingcar.controller;

import racingcar.handler.CarRaceHandler;
import racingcar.handler.InputHandler;
import racingcar.handler.OutputHandler;

public class CarRaceController {

    private CarRaceHandler carRaceHandler;

    public CarRaceController() {
        this.carRaceHandler = null;
    }

    public void start() {
        createCarRace();
        startCarRace(inputCarMoveNumber());
        noticeCarRaceWinner();
    }

    public void createCarRace() {
        OutputHandler.printCarNameInput();
        carRaceHandler = new CarRaceHandler(InputHandler.makeCars());
    }

    public Integer inputCarMoveNumber() {
        OutputHandler.printCarMoveCount();
        return InputHandler.makeMove();
    }

    public void startCarRace(int move) {
        OutputHandler.printLineSpace();
        OutputHandler.printResult();
        carRaceHandler.makeMoveCar(move);
    }

    public void noticeCarRaceWinner() {
        OutputHandler.printWinner();
        OutputHandler.printCarRaceWinnerList(carRaceHandler.findMaxAdvanceCarName());
    }
}
