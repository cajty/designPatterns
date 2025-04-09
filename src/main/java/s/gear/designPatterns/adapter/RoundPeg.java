package s.gear.designPatterns.adapter;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * RoundPegs are compatible with RoundHoles.
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
public class RoundPeg {
    private double radius;

    public double getRadius() {
        return radius;
    }
}