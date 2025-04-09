package s.gear.designPatterns.factory;


import s.gear.designPatterns.menu.PatternDemo;

/**
 * Demonstration of the Factory Pattern.
 */
public class FactoryDemo implements PatternDemo {

    @Override
    public String getPatternName() {
        return "Abstract Factory Pattern";
    }

    @Override
    public String getPatternDescription() {
        return "The Abstract Factory Pattern is a creational design pattern that provides\n" +
                "an interface for creating families of related or dependent objects without\n" +
                "specifying their concrete classes.\n\n" +
                "In this demo, we create buttons specific to operating systems.";
    }

    @Override
    public void run() {
        System.out.println("Running Abstract Factory Pattern Demo...");

        System.out.println("\nCreating Windows-style components:");
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.paint();

        System.out.println("\nCreating MacOS-style components:");
        GUIFactory macFactory = new MacOSFactory();
        Application macApp = new Application(macFactory);
        macApp.paint();

        System.out.println("\nDetecting and creating components for current OS:");
        Application app = configureApplication();
        app.paint();
    }

    private Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        // Fixed the logic that was reversed in original code
        if (osName.contains("mac")) {
            System.out.println("Detected macOS: Using MacOSFactory");
            factory = new MacOSFactory();
        } else {
            System.out.println("Detected " + osName + ": Using WindowsFactory");
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        return app;
    }
}