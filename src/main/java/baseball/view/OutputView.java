package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class OutputView {
    private final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";

    private final String GAME_OVER_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public void printGameStartMessage(){
        System.out.println(GAME_START_MESSAGE);
    }

    public void printGameOverMessage(){
        System.out.println(GAME_OVER_MESSAGE);
    }
}
