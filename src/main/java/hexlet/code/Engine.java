package hexlet.code;

import java.util.List;
import java.util.Scanner;

public class Engine {
    static int countRounds = 3;

    static public void run(String description, List<String[]> rounds) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println(description);
        for (var round : rounds) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println(String.format("Question: %s", question));
            System.out.println("Your answer: ");
            String userAnswer = scanner.next();

            if (!correctAnswer.equals(userAnswer)) {
                System.out.println(String.format("'%s' is wrong answer ;(. Correct answer was '%s'", userAnswer, correctAnswer));
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println(String.format("Congratulations, %s!", userName));
    }
}
