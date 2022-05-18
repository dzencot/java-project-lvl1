package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

import static hexlet.code.Utils.getRandomNumber;

public class GCD {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static String description = "Find the greatest common divisor of given numbers.";

    public static void run() {
        List<String[]> rounds = new ArrayList<>();
        for (var i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            int number1 = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int number2 = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String question = String.format("%d %d", number1, number2);
            String correctAnswer = Integer.toString(getGcd(number1, number2));
            rounds.add(new String[]{question, correctAnswer});
        }
        Engine.run(description, rounds);
    }

    private static int getGcd(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }

        return number2;
    }
}
