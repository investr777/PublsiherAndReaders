package visual;

import javax.swing.*;

public class VisualArchiveNews {
    public static JTextArea archiveNews;

    public static JPanel archiveNews() {
        JPanel archivePanel = new JPanel();
        archivePanel.setBorder(BorderFactory.createTitledBorder("Archive of news"));
        archivePanel.setLayout(new BoxLayout(archivePanel, BoxLayout.Y_AXIS));

        archiveNews = new JTextArea(10, 20);
        archiveNews.setEditable(false);
        archiveNews.setLineWrap(true);

        JScrollPane scrollPaneForArchiveNews = new JScrollPane(archiveNews);
        scrollPaneForArchiveNews.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneForArchiveNews.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        archivePanel.add(scrollPaneForArchiveNews);
        return archivePanel;
    }
}
