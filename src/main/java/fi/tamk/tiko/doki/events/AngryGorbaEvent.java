package fi.tamk.tiko.doki.events;

import fi.tamk.tiko.doki.Character;
import fi.tamk.tiko.doki.Choice;
import fi.tamk.tiko.doki.Event;
import fi.tamk.tiko.doki.Game;

public class AngryGorbaEvent extends Event {

    public AngryGorbaEvent(Game g, Character c) {
        super(g, c);
        this.setEventText("Gorba gets visibly angry. <more text here>");
        this.addChoice(new SorryChoice());
        this.addChoice(new AreYouWannaDieChoice());
        this.addChoice(new NaniChoice());
    }

    static class SorryChoice extends Choice {
        SorryChoice() {
            setChoiceText("\"Oh, I'm sorry.\"");
        }
    }

    static class AreYouWannaDieChoice extends Choice {
        AreYouWannaDieChoice() {
            setChoiceText("\"Fight me!\"");
        }
    }

    static class NaniChoice extends Choice {
        NaniChoice() {
            setChoiceText("\"What!?\"");
        }
    }
}