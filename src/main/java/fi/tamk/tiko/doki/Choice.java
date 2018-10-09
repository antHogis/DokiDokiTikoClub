package fi.tamk.tiko.doki;

public class Choice {
    String choiceText;
    Event hostEvent;
    Event nextEvent;

    public Choice() {

    }

    public Choice(Event hostEvent, Event nextEvent) {
        this.hostEvent = hostEvent;
        this.nextEvent = nextEvent;
    }

    public String getChoiceText() {
        return choiceText;
    }

    public void setChoiceText(String choiceText) {
        this.choiceText = choiceText;
    }

    public void choose() {

    }
}
