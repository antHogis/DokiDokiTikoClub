package fi.tamk.tiko.doki;

public class TextRenderer implements Renderer {
    public void renderEvent(Event e) {
        System.out.println(e.getEventText());
        for (Choice c : e.getChoices()) {
            System.out.print(e.getChoices().indexOf(c) + 1 + ". ");
            System.out.println(c.getChoiceText());
        }
        e.getCharacter().promptChoice();
    }
    public void renderText(String s) {
        System.out.println(s);
    }
}
