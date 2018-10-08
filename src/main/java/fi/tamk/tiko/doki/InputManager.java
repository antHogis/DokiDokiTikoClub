package fi.tamk.tiko.doki;

import java.util.Scanner;

public class InputManager {
    private Scanner scanner;
    private String message;

    public InputManager() {
        scanner = new Scanner(System.in);
        message = "Give input";
    }

}
