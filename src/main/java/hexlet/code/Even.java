package hexlet.code;

import java.util.ArrayList;
import java.util.List;

public class Even {
    private static int minNumber = 1;
    private static int maxNumber = 100;
    static String description = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void run() {
        List<String[]> rounds = new ArrayList<>();
        for (var i = 0; i < Engine.countRounds; i += 1) {
            int number = Util.getRandomNumber(minNumber, maxNumber);
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
