package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Integer> numbers;

//    public User(String userInput) {
//        this.numbers = createUserNumbers(userInput);
//    }

    public List<Integer> createUserNumbers(String userInput){
        numbers = new ArrayList<>();
        for(char x : userInput.toCharArray()){
            numbers.add(Character.getNumericValue(x));
        }
        return numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
