package fi.tamk.tiko.doki.events;
import fi.tamk.tiko.doki.Choice;
import fi.tamk.tiko.doki.Event;
import fi.tamk.tiko.doki.Character;

public class MainMenuEvent extends Event {

    public MainMenuEvent(Character c) {
        super(c);
    }

    public static class NewGameChoice extends Choice {
        public void choose() {

        }
    }
}
