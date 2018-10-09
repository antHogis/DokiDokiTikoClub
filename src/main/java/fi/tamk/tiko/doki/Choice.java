package fi.tamk.tiko.doki;

public abstract class Choice {
    String choiceText;
    Event hostEvent;
    Event nextEvent;

    public String getChoiceText() {
        return choiceText;
    }

    public void setChoiceText(String choiceText) {
        this.choiceText = choiceText;
    }

    public abstract void choose();
}
