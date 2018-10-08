package fi.tamk.tiko.doki.events;

import fi.tamk.tiko.doki.Event;
import fi.tamk.tiko.doki.Game;
import fi.tamk.tiko.doki.Character;

public class NameInputEvent extends Event {
    public NameInputEvent(Game g, Character c) {
        super(g, c);
        String charName;
        g.getRenderer().renderText("Input character name: ");
        charName = g.getInputManager().getStringInput(input -> ((input.length() > 0) && (input.length() < 20)));
        g.getPc().setName(charName);
        g.getPc().setCurrentEvent(new WakeUpEvent(g, c));
    }
    public void choose() {}
}
