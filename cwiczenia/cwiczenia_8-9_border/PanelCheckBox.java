package pad.border;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelCheckBox extends JPanel {

    public PanelCheckBox() {

        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(400,115));
        setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.RED,4),
                "Zaznacz sport, który uprawiasz:",
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 22),
                Color.GREEN
        ));
        setBackground(Color.decode("#467fdb"));
        JCheckBox checkBoxSurfing = new JCheckBox("surfing");
        checkBoxSurfing.setBackground(Color.decode("#467fdb"));
        JCheckBox checkBoxKayaking = new JCheckBox("kayaking");
        checkBoxKayaking.setBackground(Color.decode("#467fdb"));
        checkBoxKayaking.setSelected(true);
        JCheckBox checkBoxSnowboarding = new JCheckBox("snowboarding");
        checkBoxSnowboarding.setBackground(Color.decode("#467fdb"));

        add(checkBoxSurfing);
        add(checkBoxKayaking);
        add(checkBoxSnowboarding);
        setVisible(true);
    }
}
