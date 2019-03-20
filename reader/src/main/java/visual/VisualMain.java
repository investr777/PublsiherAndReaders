package visual;

import javax.swing.*;
import java.awt.*;

public class VisualMain {
    public static void go() {
        JFrame frame = new JFrame("Reader");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(VisualNews.news(), BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
