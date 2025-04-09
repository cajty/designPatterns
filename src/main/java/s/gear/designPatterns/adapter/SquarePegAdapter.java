package s.gear.designPatterns.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Adapter allows fitting square pegs into round holes.
 */

@Component
@NoArgsConstructor
@AllArgsConstructor
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;



    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
