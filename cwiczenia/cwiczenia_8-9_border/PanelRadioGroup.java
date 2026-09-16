package pad.border;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelRadioGroup extends JPanel {

    public PanelRadioGroup() {

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(267,115));
        setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.RED,4),
                "Wybierz:",
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 22),
                Color.GREEN
        ));
        setBackground(Color.decode("#467fdb"));

        JRadioButton radioKino = new JRadioButton("Idę do kina");
        radioKino.setBackground(Color.decode("#467fdb"));
        radioKino.setFont(new Font("Arial",Font.PLAIN,20));
        radioKino.setSelected(true);
        JRadioButton radioTeatr = new JRadioButton("Idę do teatru");
        radioTeatr.setBackground(Color.decode("#467fdb"));
        radioTeatr.setFont(new Font("Arial",Font.PLAIN,20));
        JRadioButton radioSpacer = new JRadioButton("Idę na spacer",true);
        radioSpacer.setBackground(Color.decode("#467fdb"));
        radioSpacer.setFont(new Font("Arial",Font.PLAIN,20));

        //Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(radioKino);
        group.add(radioTeatr);
        group.add(radioSpacer);

        add(radioKino, BorderLayout.NORTH);
        add(radioTeatr,BorderLayout.CENTER);
        add(radioSpacer,BorderLayout.SOUTH);
    }
}
