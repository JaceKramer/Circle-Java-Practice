import java.awt.*;
import java.util.function.BinaryOperator;

public class Square implements Drawable {

    private double size;

    private Color color;

    public Square(double size, Color color) {
        this.size = size;
        this.color = color;
    }

    public static Square squareMaker ( double minSize, double maxSize, int minRed,
                                       int maxRed, int minGreen, int maxGreen, int minBlue, int maxBlue) {
        BinaryOperator<Integer> binOp;
        binOp = (Integer x, Integer y) -> (int) (Math.random() * (y - x + 1) + x);

        double siz = Math.random() * (maxSize - minSize) + minSize;
        int r = binOp.apply(minRed, maxRed);
        int g = binOp.apply(minGreen, maxGreen);
        int b = binOp.apply(minBlue, maxBlue);

        return new Square(siz, new Color(r, g, b));
    }

    public String describe() {
        return "A Square " + "\nSize:\t" + size
                + "\nColor:\t" + color + "\n";
    }

    public double getSize() {
        return size;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x, y, (int)size, (int)size);
    }

    public String toString() {
        return "A Square of Size " + size + "\n";
    }

}
