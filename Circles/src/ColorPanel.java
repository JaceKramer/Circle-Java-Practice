import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel {

    private Color color;

    public ColorPanel(Color color) {
        this.color = color;
        this.setBackground(color);
        this.setPreferredSize(new Dimension(250, 250));


    }

    public Color getColor() {
        return color;
    }



}
