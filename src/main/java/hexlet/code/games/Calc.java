package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

import static hexlet.code.Utils.getRandomNumber;

public class Calc {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void run() {
        List<String[]> rounds = new ArrayList<>();
        for (var i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            int operand1 = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int operand2 = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int randomIndex = getRandomNumber(0, OPERATORS.length - 1);
            String operator = OPERATORS[randomIndex];

            String question = String.format("%d %s %d", operand1, operator, operand2);
            String correctAnswer = Integer.toString(calculate(operator, operand1, operand2));

            rounds.add(new String[]{question, correctAnswer});
        }
        Engine.run(DESCRIPTION, rounds);
    }

    private static int calculate(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            default:
                throw new Error(String.format("Unknown operator: %s", operator));
        }
    }
}
