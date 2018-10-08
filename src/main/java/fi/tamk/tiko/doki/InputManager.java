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
            //System.out.println(this.message);
            input = scanner.nextLine();
        } while (!inputValidator.validInput(input));

        return input;
    }

    public String getStringInput(StringInputValidator inputValidator, String message) {
        String input;
        this.message = message;

        do {
            //System.out.println(this.message);
            input = scanner.nextLine();
        } while (!inputValidator.validInput(input));

        return input;
    }

    public int getIntInput(IntInputValidator inputValidator) {
        int returnValue = 0;
        boolean validInput = false;

        do {
            //System.out.println(this.message);
            String input = scanner.nextLine();
            try {
                returnValue = Integer.parseInt(input);
                if (inputValidator.validInput(returnValue)) {
                    validInput = true;
                }
            } catch (NumberFormatException e) {

            }
        } while (!validInput);

        return returnValue;
    }

}
