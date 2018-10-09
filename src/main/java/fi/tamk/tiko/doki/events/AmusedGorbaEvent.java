package fi.tamk.tiko.doki.events;

import fi.tamk.tiko.doki.Character;
import fi.tamk.tiko.doki.Choice;
import fi.tamk.tiko.doki.Event;
import fi.tamk.tiko.doki.Game;

public class AmusedGorbaEvent extends Event {

    public AmusedGorbaEvent(Game g, Character c) {
        super(g, c);
        this.setEventText("Gorba bursts into laughter <More text here>");
        this.addChoice(new WhyIsthatSoFunnyChoice());
        this.addChoice(new SayNothingChoice());
        this.addChoice(new GTFOChoice());
    }

    static class WhyIsthatSoFunnyChoice extends Choice {
        WhyIsthatSoFunnyChoice() {
            setChoiceText("\"Why are you laughing?\"");
        }
    }

    static class SayNothingChoice extends Choice {
        SayNothingChoice() {
            setChoiceText("\"...\"");
        }
    }

    static class GTFOChoice extends Choice {
        GTFOChoice() {
            setChoiceText("\"Fuck this shit, I'm out. Later, asshole. *Walk out of the classroom*\"");
        }
    }
}