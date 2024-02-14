import java.awt.*;

public interface Drawable {
    void draw(Graphics g, int x, int y);
    String describe();
    double getSize();
}
