package fi.tamk.tiko.doki;

public class TextRenderer implements Renderer {
    public void renderEvent(Event e) {
        System.out.println(e.getEventText());
        for (Choice c : e.getChoices()) {
            System.out.println(c.getChoiceText());
        }
    }
}
