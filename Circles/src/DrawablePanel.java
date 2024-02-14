import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DrawablePanel extends JPanel{

    ArrayList<Drawable> shapes;

    public DrawablePanel(ArrayList<Drawable> shapes) {
        this.setPreferredSize(new Dimension(1200, 300));
        this.shapes = shapes;
    }

    public void paintComponent(Graphics g) {
        int x = 0;
        for (Drawable d : shapes){
            d.draw(g, x, 25);
            x += (int) (d.getSize() + 10);
        }

    }
}
