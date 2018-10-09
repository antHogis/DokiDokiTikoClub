package fi.tamk.tiko.doki.events;

import fi.tamk.tiko.doki.Character;
import fi.tamk.tiko.doki.Choice;
import fi.tamk.tiko.doki.Event;
import fi.tamk.tiko.doki.Game;

public class AngryGorbaEvent extends Event {

    public AngryGorbaEvent(Game g, Character c) {
        super(g, c);
        this.setEventText("Gorba gets visibly angry. No, " + c.getName() + "I have been here waiting for people to get "
            + "their tickets to tonight's party. I was gonna give you one for free, if you'd been nice, you know.");
            
        this.addChoice(new SorryChoice());
        this.addChoice(new FightGorbaChoice());
        this.addChoice(new NaniChoice());
    }

    static class SorryChoice extends Choice {
        SorryChoice() {
            setChoiceText("Damn Gorba. Didn't mean to offend you. I'm just a bit cranky when I wake up from a nap");
        }

        @Override
        public void choose() {
            
        }
    }

    static class FightGorbaChoice extends Choice {
        FightGorbaChoice() {
            setChoiceText("\"Fight me!\"");
        }

        @Override
        public void choose() {
            
        }
    }

    static class NaniChoice extends Choice {
        NaniChoice() {
            setChoiceText("\"What!?\"");
        }

        @Override
        public void choose() {
            
        }
    }
}