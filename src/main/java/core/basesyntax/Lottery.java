package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_BALL_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_RANDOM_BALL_NUMBER);
        return new Ball(randomNumber, randomColor);
    }
}