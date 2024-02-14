import java.awt.*;
import java.util.function.BinaryOperator;

public class Circle implements Drawable {
    /*diameter: double
x:int
y:int
color: java.awt.Color
*/

    private double diameter;

    private Color color;

    /*
    Circles should have a constructor that takes in a diameter, x, and y, and color.
describe() String    // should return a string description of the circle including its location, diameter, and color.
draw(Graphics g) {
    g.setColor(color);
}
     */

    public Circle(double diameter, Color color) {
        this.diameter = diameter;

        this.color = color;
    }

        public static Circle circleMaker ( double minSize, double maxSize, int minRed,
        int maxRed, int minGreen, int maxGreen, int minBlue, int maxBlue) {
        BinaryOperator<Integer> binOp;
        binOp = (Integer x, Integer y) -> (int) (Math.random() * (y - x + 1) + x);

        double diam = Math.random() * (maxSize - minSize) + minSize;
        int r = binOp.apply(minRed, maxRed);
        int g = binOp.apply(minGreen, maxGreen);
        int b = binOp.apply(minBlue, maxBlue);

        return new Circle(diam, new Color(r, g, b));


    }

    public String describe() {
        return "A Circle " + "\nDiameter:\t" + diameter
                + "\nColor:\t" + color + "\n";
    }

    public double getDiameter() {
        return diameter;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillOval(x, y, (int)diameter, (int)diameter);
    }

    public String toString() {
        return "A Circle of diameter " + diameter + "\n";
     }

}
