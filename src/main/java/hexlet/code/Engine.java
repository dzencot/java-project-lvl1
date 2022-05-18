package hexlet.code;

import java.util.List;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void run(String description, List<String[]> rounds) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println(description);
        for (var round : rounds) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println(String.format("Question: %s", question));
            String userAnswer = scanner.next();
            System.out.println(String.format("Your answer: %s", userAnswer));

            if (!correctAnswer.equals(userAnswer)) {
                System.out.println(
                        String.format("'%s' is wrong answer ;(. Correct answer was '%s'", userAnswer, correctAnswer));
                System.out.println(String.format("Let's try again, %s!", userName));
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println(String.format("Congratulations, %s!", userName));
    }
}
