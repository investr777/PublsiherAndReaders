package visual;

import javax.swing.*;
import java.awt.*;

public class VisualMain {

    public static void go() {
        JFrame frame = new JFrame("Publisher");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, ButtonPublish.button());
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(VisualArchiveNews.archiveNews());
        mainPanel.add(VisualNewNews.newNews());
        frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
