package s.gear.designPatterns.menu;

/**
 * Common interface for all design pattern demonstrations.
 * Each pattern demo should implement this interface.
 */
public interface PatternDemo {

    /**
     * Get the name of the pattern for display in the menu
     */
    String getPatternName();

    /**
     * Get a brief description of the pattern
     */
    String getPatternDescription();

    /**
     * Execute the pattern demonstration
     */
    void run();
}