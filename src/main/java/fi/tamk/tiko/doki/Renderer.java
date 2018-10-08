package fi.tamk.tiko.doki;

public interface Renderer {
    abstract void renderEvent(Event e);
    abstract void renderText(String s);
}
