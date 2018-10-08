package fi.tamk.tiko.doki;

public class TextGame {
    private Renderer renderer;
    private InputManager inputManager;
    private Character pc;

    public Renderer getRenderer() {
        return renderer;
    }

    public InputManager getInputManager() {
        return inputManager;
    }

    public Character getPc() {
        return pc;
    }

    public void start() {
        this.inputManager = new InputManager();
        this.renderer = new TextRenderer();
        this.pc = new Character();
    }
}
