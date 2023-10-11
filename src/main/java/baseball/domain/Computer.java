package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<Integer> numbers;

    public Computer() {
        this.numbers = createRandomNumber();
    }

    public List<Integer> createRandomNumber(){
        numbers = new ArrayList<>();
        for(int i=0; i<3; i++){
            numbers.add(Randoms.pickNumberInRange(1,9));
        }
        return numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
