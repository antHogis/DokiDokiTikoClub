package fi.tamk.tiko.doki;

import java.util.ArrayList;
import java.util.List;

public class Event {
    Character c;
    Game g;
    List<Choice> choices;
    String eventText;

    public Event(Game g, Character c) {
        this.c = c;
        this.g = g;
        this.choices = new ArrayList<>();
    }

    public void addChoice(Choice c) {
        choices.add(c);
    }

    public void setEventText(String eventText) {
        this.eventText = eventText;
    }

    public String getEventText() {
        return eventText;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void render() {
        g.getRenderer().renderEvent(this);
    }
}
