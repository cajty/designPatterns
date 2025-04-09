package s.gear.designPatterns.adapter;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * RoundHoles are compatible with RoundPegs.
 */

@Component
@NoArgsConstructor
@AllArgsConstructor
public class RoundHole {
    private double radius;


    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
