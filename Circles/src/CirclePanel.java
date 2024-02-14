import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class CirclePanel extends JPanel{

    ArrayList<Circle> circles;

    public CirclePanel(ArrayList<Circle> circles) {
        this.setPreferredSize(new Dimension(1200, 300));

        this.circles = circles;
    }

    public void paintComponent(Graphics g) {
        int x = 0;
        for (Circle c : circles){
            c.draw(g, x, 25);
            x += c.getDiameter() + 10;
    }

}
}
