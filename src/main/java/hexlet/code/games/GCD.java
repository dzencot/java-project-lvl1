package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

import static hexlet.code.Utils.getRandomNumber;

public class GCD {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void run() {
        List<String[]> rounds = new ArrayList<>();
        for (var i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            int number1 = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int number2 = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String question = String.format("%d %d", number1, number2);
            String correctAnswer = Integer.toString(gcd(number1, number2));
            rounds.add(new String[]{question, correctAnswer});
        }
        Engine.run(DESCRIPTION, rounds);
    }

    private static int gcd(int number1, int number2) {
        return number2 == 0 ? number1 : gcd(number2, number1 % number2);
    }
}
