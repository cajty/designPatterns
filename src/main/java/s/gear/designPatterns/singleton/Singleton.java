package s.gear.designPatterns.singleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Singleton {
    public String value;

    public Singleton(@Value("${singleton.value:DEFAULT}") String value) {
        // Simulate slow initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }
}