package s.gear.designPatterns.observer;




public class DemoObserver {
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("docAdapter.md"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("docAdapter.md");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
