package s.gear.designPatterns.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoSingleton implements CommandLineRunner {

    private final Singleton firstSingleton;
    private final ApplicationContext context;

    @Autowired
    public DemoSingleton(Singleton singleton, ApplicationContext context) {
        this.firstSingleton = singleton;
        this.context = context;
    }

    @Override
    public void run(String... args) {
        System.out.println("\n--- Singleton Pattern Demo ---");
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        // Get the first singleton instance (injected)
        System.out.println("First instance value: " + firstSingleton.value);

        // Get the second singleton instance from the context
        // (Spring guarantees it's the same instance)
        Singleton secondSingleton = context.getBean(Singleton.class);
        System.out.println("Second instance value: " + secondSingleton.value);

        // Show reference comparison
        System.out.println("Is same instance? " + (firstSingleton == secondSingleton));
    }
}