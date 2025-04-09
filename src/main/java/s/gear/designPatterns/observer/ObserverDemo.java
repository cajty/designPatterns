package s.gear.designPatterns.observer;


import s.gear.designPatterns.menu.PatternDemo;



public class ObserverDemo implements PatternDemo {

    @Override
    public String getPatternName() {
        return "Observer Pattern";
    }

    @Override
    public String getPatternDescription() {
        return "The Observer Pattern is a behavioral design pattern where an object, called the subject,\n" +
                "maintains a list of its dependents, called observers, and notifies them automatically\n" +
                "of any state changes.\n\n" +
                "In this demo, we have an Editor that notifies observers when files are opened or saved.";
    }

    @Override
    public void run() {
        System.out.println("Running Observer Pattern Demo...");

        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("file-log.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            System.out.println("\nOpening test file...");
            editor.openFile("test-document.txt");

            System.out.println("\nSaving test file...");
            editor.saveFile();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
