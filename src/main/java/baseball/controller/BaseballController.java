package baseball.controller;

import baseball.domain.Baseball;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {

    private BaseballService baseballService;

    private OutputView outputView = new OutputView();

    private InputView inputView = new InputView();

    public void choiceRestart(){
        baseballService = new BaseballService();
        outputView.printGameStartMessage();

        do{
            Baseball baseBall = baseballService.startGame();
            playGame(baseBall);

        } while(baseballService.choiceRestart());

    }

    public void playGame(Baseball baseball){
        do {
            inputView.printInputNumberMessage();
            baseballService.callNumber(baseball);

        }while(baseballService.checkNumber(baseball));
    }
}
