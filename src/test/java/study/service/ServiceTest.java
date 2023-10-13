package study.service;

import baseball.domain.Baseball;
import baseball.domain.Computer;
import baseball.domain.User;
import baseball.service.BaseballService;
import static org.junit.jupiter.api.Assertions.*;

import camp.nextstep.edu.missionutils.Console;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class ServiceTest {

    private BaseballService baseballService = new BaseballService();

    @Test
    @DisplayName("숫자 3개가 들어왔을 때 : 정상 ")
    public void callNumber_정상(){

        String input = "123";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Baseball baseball = new Baseball(new User(),new Computer());

        assertDoesNotThrow(() -> baseballService.callNumber(baseball));
    }

    @Test
    @DisplayName("숫자 4개 들어왔을 때 : 예외발생")
    public void callNumber_숫자예외(){

        String input = "1234";

        Baseball mockBaseball = mock(Baseball.class);

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(IllegalArgumentException.class, () -> baseballService.callNumber(mockBaseball));
    }

    @Test
    @DisplayName("숫자가 아닌 값이 들어왔을 때 : 예외발생")
    public void callNumberTest_문자예외(){
        String input = "12a";

        Baseball mockBaseball = mock(Baseball.class);

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(IllegalArgumentException.class, () -> baseballService.callNumber(mockBaseball));
    }


}
