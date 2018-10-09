package fi.tamk.tiko.doki;
import fi.tamk.tiko.doki.events.*;

public class TextGame extends Game {
    public TextGame() {
        this.inputManager = new InputManager();
        this.renderer = new TextRenderer();
        this.player = new Character();
    }

    public void start() {
        player.setCurrentEvent(new MainMenuEvent(this, player));
    }
}
