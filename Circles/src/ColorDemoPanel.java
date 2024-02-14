import javax.swing.*;
import java.awt.*;

public class ColorDemoPanel extends JPanel{

    ColorPanel[] colors;

    public ColorDemoPanel() {
        this.setPreferredSize(new Dimension(770, 770));
        colors = new ColorPanel[9];
        colors[0] = new ColorPanel(Color.GREEN);
        colors[1] = new ColorPanel(Color.yellow);
        colors[2] = new ColorPanel(Color.MAGENTA);
        colors[3] = new ColorPanel(Color.BLUE);
        colors[4] = new ColorPanel(Color.CYAN);
        colors[5] = new ColorPanel(Color.ORANGE);
        colors[6] = new ColorPanel(Color.PINK);
        colors[7] = new ColorPanel(Color.RED);
        colors[8] = new ColorPanel(new Color(128, 0, 128));

        for (ColorPanel color : colors)
            this.add(color);


    }





}
