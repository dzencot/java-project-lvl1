package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

import static hexlet.code.Utils.getRandomNumber;

public class Prime {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        List<String[]> rounds = new ArrayList<>();
        for (var i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            int number = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String question = Integer.toString(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";
            rounds.add(new String[]{question, correctAnswer});
        }
        Engine.run(description, rounds);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i += 1) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
