package fi.tamk.tiko.doki;

import java.util.Scanner;

public class InputManager {
    private Scanner scanner;
    private String message;

    public InputManager() {
        scanner = new Scanner(System.in);
        message = "Give input";
    }

    public String getStringInput(StringInputValidator inputValidator) {
        String input;
        do {
            System.out.println(this.message);
            input = scanner.nextLine();
        } while (!inputValidator.validInput(input));

        return input;
    }

    public String getStringInput(StringInputValidator inputValidator, String message) {
        String input;
        this.message = message;

        do {
            System.out.println(this.message);
            input = scanner.nextLine();
        } while (!inputValidator.validInput(input));

        return input;
    }

}
