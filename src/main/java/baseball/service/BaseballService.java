package baseball.service;

import baseball.domain.Baseball;
import baseball.domain.Computer;
import baseball.domain.User;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class BaseballService {

    Baseball baseball;

    private InputView inputView = new InputView();

    private OutputView outputView = new OutputView();

    public Baseball startGame(){
        User user = new User();
        Computer computer = new Computer();

        baseball = new Baseball(user,computer);
        return baseball;
    }

    public void callNumber(Baseball baseball){
        String number = Console.readLine();
        baseball.getUser().createUserNumbers(number);
    }


    public boolean checkNumber(Baseball baseball){
        List<Integer> userNumber = baseball.getUser().getNumbers();
        List<Integer> computerNumber = baseball.getComputer().getNumbers();

        baseball.getCount().compareNumber(userNumber,computerNumber);

        if(baseball.getCount().getStrike() == 3){
            outputView.printGameOverMessage();
            return false;
        }
        return true;

    }

    public boolean choiceRestart(){
        inputView.printInputRestartMessage();
        String input = Console.readLine();
        if(input.equals("1")) {
            return true;
        }
        return false;
    }
}
