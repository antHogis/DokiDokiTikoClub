package fi.tamk.tiko.doki.events;
import fi.tamk.tiko.doki.Choice;
import fi.tamk.tiko.doki.Event;
import fi.tamk.tiko.doki.Character;
import fi.tamk.tiko.doki.Game;

public class MainMenuEvent extends Event {

    public MainMenuEvent(Game g, Character c) {
        super(g, c);
        this.setEventText("WELCOME TO VIDEO GAME.");
        addChoice(new NewGameChoice());
        addChoice(new ExitGameChoice());
    }

    public static class NewGameChoice extends Choice {
        public NewGameChoice() {
            this.setChoiceText("NEW GAME");
        }
        public void choose() {
            getCharacter().setCurrentEvent(new NameInputEvent(g, c));
        }
    }

    public static class ExitGameChoice extends Choice {
        public ExitGameChoice() { this.setChoiceText("EXIT GAME"); }
        public void choose() {
            System.exit(0);
        }
    }
}
