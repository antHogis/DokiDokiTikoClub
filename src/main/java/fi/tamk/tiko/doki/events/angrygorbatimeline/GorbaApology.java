package fi.tamk.tiko.doki.events.angrygorbatimeline;

import fi.tamk.tiko.doki.Character;
import fi.tamk.tiko.doki.Choice;
import fi.tamk.tiko.doki.Event;
import fi.tamk.tiko.doki.Game;

public class GorbaApology extends Event {
    public GorbaApology(Game g, Character c) {
        super(g, c);
        this.setEventText("Yeah, I get that all the time. One time my girlfriend woke me up in the middle up of my nap, and then I beat " +
            "her to a red mushy pulp.\nGorba laughs for a solid 30 seconds.\n...Yeah, anyway... It's all good, " + c.getName() +
            ", how about coming to the party tonight?");

    }

    static class goToPartyChoice extends Choice {
        goToPartyChoice() {

        }

        @Override
        public void choose() {
            
        }
    }
}