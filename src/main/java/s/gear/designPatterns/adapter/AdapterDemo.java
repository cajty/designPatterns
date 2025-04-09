package s.gear.designPatterns.adapter;

import s.gear.designPatterns.menu.PatternDemo;

/**
 * Demonstration of the Adapter Pattern.
 */
public class AdapterDemo implements PatternDemo {

    @Override
    public String getPatternName() {
        return "Adapter Pattern";
    }

    @Override
    public String getPatternDescription() {
        return "The Adapter Pattern is a structural design pattern that allows objects with\n" +
                "incompatible interfaces to collaborate. It acts as a bridge between two\n" +
                "incompatible interfaces.\n\n" +
                "In this demo, we adapt a square peg to fit into a round hole.";
    }

    @Override
    public void run() {
        System.out.println("Running Adapter Pattern Demo...");

        // Round fits round, no surprise
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        System.out.println("\nTesting round peg with radius 5 in round hole with radius 5:");
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        } else {
            System.out.println("Round peg r5 does not fit round hole r5.");
        }

        // Square pegs
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(10);

        // Adapter in action
        System.out.println("\nTesting square pegs using adapter:");
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        System.out.println("Square peg width 2 has effective radius: " + smallSqPegAdapter.getRadius());
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        } else {
            System.out.println("Square peg w2 does not fit round hole r5.");
        }

        System.out.println("\nSquare peg width 10 has effective radius: " + largeSqPegAdapter.getRadius());
        if (hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w10 fits round hole r5.");
        } else {
            System.out.println("Square peg w10 does not fit round hole r5.");
        }
    }
}
