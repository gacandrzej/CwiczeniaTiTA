package pad.border;

import javax.swing.*;
import java.awt.*;

public class BorderComponents extends JFrame {

    public BorderComponents() throws HeadlessException {

        initWindow();

        MainPanel mainPanel = new MainPanel();

        add(mainPanel);
    }

    private void initWindow() {
        setSize(800,700);
        setTitle("--------- test border -------");
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon2 = new ImageIcon("picture/raven.png");
        setIconImage(icon2.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
      SwingUtilities.invokeLater( ()-> new BorderComponents().setVisible(true));
    }
}
