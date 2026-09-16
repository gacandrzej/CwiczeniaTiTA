package pad.border;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class PanelIcon extends JPanel {

    public PanelIcon() {

        setBackground(Color.decode("#467fdb"));
        int heightIcon =16;
        setPreferredSize(new Dimension(400,heightIcon*9));
        ImageIcon icon = new ImageIcon("icon/tree.png");
        Image scaledIcon = icon.getImage().getScaledInstance(
                heightIcon,heightIcon,Image.SCALE_SMOOTH);

        /*panelIcon.setBorder(BorderFactory.createMatteBorder(
                -1,-1,-1,-1,icon
                ));*/
        setBorder(new MatteBorder(new ImageIcon(scaledIcon)));
    }
}
