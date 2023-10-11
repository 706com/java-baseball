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
        if(isValidNumber(number)){
            baseball.getUser().createUserNumbers(number);
        }
        else{
            throw new IllegalArgumentException();
        }

    }

    public boolean isValidNumber(String number){
        if(number.length() != 3)
            return false;

        for(int i=0; i<number.length(); i++){
            char c = number.charAt(i);
            if(c<48 || c>57){
                return false;
            }
        }

        return true;
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
