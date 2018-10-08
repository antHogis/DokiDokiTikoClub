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
    }

    public static class NewGameChoice extends Choice {
        public NewGameChoice() {
            this.setChoiceText("NEW GAME");
        }
        public void choose() {

        }
    }
}
