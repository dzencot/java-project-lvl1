package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomNumber;

import java.util.ArrayList;
import java.util.List;

public class Even {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static String description = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void run() {
        List<String[]> rounds = new ArrayList<>();
        for (var i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            int number = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String question = Integer.toString(number);
            String correctAnswer = isEven(number) ? "yes" : "no";
            rounds.add(new String[]{question, correctAnswer});
        }
        Engine.run(description, rounds);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
