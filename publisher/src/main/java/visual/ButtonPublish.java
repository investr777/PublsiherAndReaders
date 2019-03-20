package visual;

import config.ConfigNetwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ButtonPublish {
    public static JPanel button() {
        JButton button = new JButton("Publish");
        button.addActionListener(new SendButtonListener());
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 15, 5));
        buttonPanel.add(button);
        return buttonPanel;
    }

    private static class SendButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("d.MM.yyyy, hh:mm:ss: ");
                Calendar calendar = new GregorianCalendar();
                String message = dateFormat.format(calendar.getTime()) + VisualNewNews.newNews.getText() + "\n";
                VisualArchiveNews.archiveNews.append(message);
                ConfigNetwork.writer.println(message);
                ConfigNetwork.writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            VisualNewNews.newNews.setText("");
            VisualNewNews.newNews.requestFocus();
        }
    }
}
