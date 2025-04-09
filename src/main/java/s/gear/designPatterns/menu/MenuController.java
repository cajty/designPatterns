package s.gear.designPatterns.menu;



import org.springframework.stereotype.Component;
import java.util.Scanner;

/**
 * Controller for the design pattern menu system.
 */
@Component
public class MenuController {

    private final DemoFactory demoFactory;
    private final Scanner scanner;

    public MenuController(DemoFactory demoFactory) {
        this.demoFactory = demoFactory;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int option = getUserOption();

            if (option == 0) {
                exit = true;
                System.out.println("Exiting the application. Goodbye!");
            } else {
                try {
                    PatternDemo demo = demoFactory.createDemo(option);
                    System.out.println("\n===== " + demo.getPatternName() + " =====");
                    System.out.println(demo.getPatternDescription());
                    System.out.println("=".repeat(demo.getPatternName().length() + 12));
                    demo.run();
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid option. Please try again.");
                }

                System.out.println("\nPress ENTER to return to the main menu...");
                scanner.nextLine();
            }
        }
    }

    private void displayMenu() {
        System.out.println("\n======== DESIGN PATTERNS DEMO ========");
        System.out.println("Select a pattern to demonstrate:");

        for (int i = 1; i <= demoFactory.getOptionCount(); i++) {
            PatternDemo demo = demoFactory.getDemoByOption(i);
            System.out.println(i + ". " + demo.getPatternName());
        }

        System.out.println("0. Exit");
        System.out.println("=======================================");
        System.out.print("Enter your choice: ");
    }

    private int getUserOption() {
        try {
            int option = scanner.nextInt();
            scanner.nextLine(); // consume the remaining newline
            return option;
        } catch (Exception e) {
            scanner.nextLine(); // clear the invalid input
            return -1; // invalid option
        }
    }
}
