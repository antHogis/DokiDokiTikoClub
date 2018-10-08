package fi.tamk.tiko.doki;

@FunctionalInterface
public interface StringInputValidator {
    boolean validInput(String input);
}
