package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

import static hexlet.code.Utils.getRandomNumber;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static String description = "Find the greatest common divisor of given numbers.";

    public static void run() {
        List<String[]> rounds = new ArrayList<>();
        for (var i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            int start = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int step = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String[] progression = getProgression(start, step, PROGRESSION_LENGTH);

            int hiddenIndex = getRandomNumber(1, PROGRESSION_LENGTH - 1);
            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);
            rounds.add(new String[]{question, correctAnswer});
        }
        Engine.run(description, rounds);
    }

    private static String[] getProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i += 1) {
            int current = start + i * step;
            progression[i] = Integer.toString(current);
        }

        return progression;
    }
}
