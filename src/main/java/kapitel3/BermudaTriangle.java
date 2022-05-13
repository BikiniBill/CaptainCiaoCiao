package kapitel3;

import java.awt.*;

public class BermudaTriangle {
    private final static int DIMENSION = 50;

    static Polygon resetWithRandomTriangle(Polygon polygon) {
        polygon.reset();

        polygon.addPoint((int) (Math.random() * DIMENSION), (int) (Math.random() * DIMENSION));
        polygon.addPoint((int) (Math.random() * DIMENSION), (int) (Math.random() * DIMENSION));
        polygon.addPoint((int) (Math.random() * DIMENSION), (int) (Math.random() * DIMENSION));

        return polygon;
    }

    static Polygon createRandomTriangle() {
        return resetWithRandomTriangle(new Polygon());
    }

    public static void main(String[] args) {
        final String OCTOPUS = "\uD83D\uDC19";
        final String RAINBOW = "\uD83C\uDF08";

        Polygon bermudeTriangle = new Polygon();
        Polygon bermudaTriangle = createRandomTriangle();
        resetWithRandomTriangle(bermudeTriangle);

        System.out.println(bermudeTriangle.contains(new Point(10, 20)));

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.print(bermudeTriangle.contains(new Point(i, j)) ? OCTOPUS : RAINBOW);
            }
            System.out.println();
        }

        System.out.println("Man kann nicht genau sagen, wie sich die Punkte auf der Außenlinie verhalten.");
    }
}
