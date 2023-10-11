package baseball;

import baseball.controller.BaseballController;

public class Application {
    private static BaseballController baseBallController;

    public static void main(String[] args) {
        baseBallController = new BaseballController();

        baseBallController.choiceRestart();
    }
}

// Todo : static , nonstatic 차이 명확히 파악하기