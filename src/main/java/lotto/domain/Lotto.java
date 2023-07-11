package lotto.domain;

import java.util.List;

public class Lotto {

    private static final int SIZE = 6;
    private static final String LOTTO_SIZE_EXCEPTION_MESSAGE = "로또 번호는 6개여야 합니다.";
    private List<Ball> balls;

    public Lotto(final List<Ball> balls) {
        validate(balls);
        this.balls = balls;
    }

    private void validate(final List<Ball> balls) {
        if (balls.stream().distinct().count() != balls.size()) {
            throw new IllegalArgumentException();
        }
        if (balls.size() != SIZE) {
            throw new IllegalArgumentException(LOTTO_SIZE_EXCEPTION_MESSAGE);
        }
    }
}
