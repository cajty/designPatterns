package s.gear.designPatterns.menu;



import org.springframework.stereotype.Component;
import s.gear.designPatterns.adapter.AdapterDemo;
import s.gear.designPatterns.factory.FactoryDemo;
import s.gear.designPatterns.observer.ObserverDemo;
import s.gear.designPatterns.singleton.SingletonDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Factory for creating design pattern demonstrations.
 */
@Component
public class DemoFactory {

    private final Map<Integer, PatternDemo> demos = new HashMap<>();


    public DemoFactory() {
        // Register all available demos
        registerDemo(1, new ObserverDemo());
        registerDemo(2, new AdapterDemo());
        registerDemo(3, new FactoryDemo());
        registerDemo(4, new SingletonDemo());
        // to add
    }

    private void registerDemo(int option, PatternDemo demo) {
        demos.put(option, demo);
    }

    public PatternDemo createDemo(int option) {
        PatternDemo demo = demos.get(option);
        if (demo == null) {
            throw new IllegalArgumentException("Invalid pattern option: " + option);
        }
        return demo;
    }

    public List<PatternDemo> getAllDemos() {
        return demos.values().stream().toList();
    }

    public int getOptionCount() {
        return demos.size();
    }

    public PatternDemo getDemoByOption(int option) {
        return demos.get(option);
    }
}