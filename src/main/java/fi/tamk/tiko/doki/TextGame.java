package fi.tamk.tiko.doki;

public class TextGame extends Game {
    
    public TextGame() {
        this.inputManager = new InputManager();
        this.renderer = new TextRenderer();
        this.pc = new Character();
    }

    public void start() {

    }
}
