package fi.tamk.tiko.doki;
import fi.tamk.tiko.doki.events.*;

public class TextGame extends Game {
    public TextGame() {
        this.inputManager = new InputManager();
        this.renderer = new TextRenderer();
        this.pc = new Character();
    }

    public void start() {
        pc.setCurrentEvent(new MainMenuEvent(this, pc));
    }
}
