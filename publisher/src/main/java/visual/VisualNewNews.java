package visual;

import javax.swing.*;

public class VisualNewNews {
    public static JTextArea newNews;

    public static JPanel newNews() {
        JPanel newsPanel = new JPanel();
        newsPanel.setBorder(BorderFactory.createTitledBorder("New news"));
        newsPanel.setLayout(new BoxLayout(newsPanel, BoxLayout.Y_AXIS));

        newNews = new JTextArea(10, 20);
        newNews.setLineWrap(true);

        JScrollPane scrollPaneForNewNews = new JScrollPane(newNews);
        scrollPaneForNewNews.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneForNewNews.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        newsPanel.add(scrollPaneForNewNews);
        return newsPanel;
    }
}
