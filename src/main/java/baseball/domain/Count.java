package baseball.domain;

import java.util.List;

public class Count {

    private int ball;

    private int strike;

    public Count(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public void compareNumber(List<Integer> user, List<Integer> computer){
        initNumber();
        checkStrike(user,computer);
        checkBall(user,computer);
    }

    public void checkStrike(List<Integer> user , List<Integer> computer){
        for(int i=0; i<user.size(); i++){
            for(int j=0; j<computer.size(); j++){
                if(user.get(i) == computer.get(j) && i == j){
                    strike++;
                }
            }
        }
    }
    public void checkBall(List<Integer> user , List<Integer> computer){
        for(int i=0; i<user.size(); i++){
            for(int j=0; j<computer.size(); j++){
                if(user.get(i) == computer.get(j) && i != j){
                    ball++;
                }
            }
        }
    }
    public void initNumber(){
        this.ball = 0;
        this.strike = 0;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }
}
