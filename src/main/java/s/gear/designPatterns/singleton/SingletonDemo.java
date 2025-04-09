package s.gear.designPatterns.singleton;

import s.gear.designPatterns.menu.PatternDemo;

/**
 * Demonstration of the Singleton Pattern.
 */
public class SingletonDemo implements PatternDemo {

    @Override
    public String getPatternName() {
        return "Singleton Pattern";
    }

    @Override
    public String getPatternDescription() {
        return "The Singleton Pattern is a creational design pattern that ensures a class has only\n" +
                "one instance and provides a global point of access to that instance.\n\n" +
                "In this demo, we create a singleton and verify that multiple getInstance() calls\n" +
                "return the same instance.";
    }

    @Override
    public void run() {
        System.out.println("Running Singleton Pattern Demo...");
        System.out.println("\nCreating first singleton instance with value 'FIRST'");
        long startTime = System.currentTimeMillis();
        Singleton singleton = Singleton.getInstance("FIRST");
        long endTime = System.currentTimeMillis();
        System.out.println("Creation time: " + (endTime - startTime) + "ms");
        System.out.println("First instance value: " + singleton.value);

        System.out.println("\nAttempting to create second singleton instance with value 'SECOND'");
        startTime = System.currentTimeMillis();
        Singleton anotherSingleton = Singleton.getInstance("SECOND");
        endTime = System.currentTimeMillis();
        System.out.println("Creation time: " + (endTime - startTime) + "ms");
        System.out.println("Second instance value: " + anotherSingleton.value);

        System.out.println("\nVerifying both references point to the same instance:");
        System.out.println("Same reference? " + (singleton == anotherSingleton));
        System.out.println("First value: " + singleton.value);
        System.out.println("Second value: " + anotherSingleton.value);

        if (singleton.value.equals("FIRST") && anotherSingleton.value.equals("FIRST")) {
            System.out.println("\nSingleton is working correctly! The value was not changed by the second getInstance() call.");
        } else {
            System.out.println("\nSingleton is NOT working correctly! The value was changed.");
        }
    }
}