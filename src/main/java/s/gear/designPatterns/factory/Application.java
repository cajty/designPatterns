package s.gear.designPatterns.factory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;


    public Application(GUIFactory factory) {
        button = factory.createButton();

    }

    public void paint() {
        button.paint();
    }
}
