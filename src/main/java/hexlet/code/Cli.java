package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println(String.format("Hello, %s!", userName));
    }
}
