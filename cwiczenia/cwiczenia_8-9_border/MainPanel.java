package pad.border;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel() {
        setBackground(Color.decode("#467fdb"));
        setLayout(new FlowLayout());
        setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.RED,4),
                "Testowanie obramowań",
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 22),
                Color.GREEN
        ));
        Border blacborder = BorderFactory.createLineBorder(Color.black,2);
        Border pinkborder = BorderFactory.createLineBorder(Color.pink,3);
        var redborder = BorderFactory.createLineBorder(Color.red,4);

        ImageIcon imageIcon = new ImageIcon("picture/owl.png");
        JButton button = new JButton("Sowa", imageIcon);
        button.setBackground(Color.pink);
        button.setBorder(blacborder);

        JTextField field = new JTextField(25);
        field.setBorder(pinkborder);
        ImageIcon imageIconRabbit = new ImageIcon("picture/rabbit.png");
        JLabel label = new JLabel(imageIconRabbit);
        label.setBorder(redborder);

        PanelCheckBox panelCheckBox = new PanelCheckBox();
        PanelRadioGroup panelRadioGroup = new PanelRadioGroup();
        PanelIcon panelIcon = new PanelIcon();

        // add components to panel
        add(label);
        add(field);
        add(button);
        add(panelRadioGroup);
        add(panelCheckBox);
        add(panelIcon);
    }
}
