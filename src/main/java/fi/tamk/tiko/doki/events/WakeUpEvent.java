package fi.tamk.tiko.doki.events;

import fi.tamk.tiko.doki.Character;
import fi.tamk.tiko.doki.Choice;
import fi.tamk.tiko.doki.Event;
import fi.tamk.tiko.doki.Game;

public class WakeUpEvent extends Event {

    public WakeUpEvent(Game g, Character c) {
        super(g, c);
        this.setEventText("You wake up. You don't remember actually falling asleep, but the room is so dark you can " +
                "barely see anything. However, you soon realize you're still sitting in the classroom after a very boring " +
                "lecture by that one teacher you really hate.\n" +
                "You notice a light in the corner of the room. It's coming from the laptop screen of your classmate Gorba," +
                " who is sitting at his computer typing something.");
        this.addChoice(new AskGorbaChoice());
        this.addChoice(new FuckYouGorbaChoice());
    }

    static class AskGorbaChoice extends Choice {
        AskGorbaChoice() {
            setChoiceText("\"What are you still doing here, Gorba?\"");
        }
    }

    static class FuckYouGorbaChoice extends Choice {
        FuckYouGorbaChoice() {
            setChoiceText("\"Were you watching me sleep, you creepy motherfucker??\"");
        }
    }
}
