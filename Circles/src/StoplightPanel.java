import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoplightPanel  extends JPanel {

    private JButton myButton;
    ColorPanel topPanel, bottomPanel, middlePanel;

    public StoplightPanel() {
        this.setPreferredSize(new Dimension(300, 900));
        this.setBackground(Color.BLACK);

        topPanel = new ColorPanel(Color.RED);
        middlePanel = new ColorPanel(Color.yellow);
        bottomPanel = new ColorPanel(Color.GREEN);

        this.add(topPanel);
        this.add(middlePanel);
        this.add(bottomPanel);

        myButton = new JButton("Click Me");
        myButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == myButton)
                myButton.setText("Thank you!");
                topPanel.setBackground(Color.BLACK);
            }
        });

        this.add(myButton);

    }


}
