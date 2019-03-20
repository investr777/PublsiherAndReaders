package visual;

import javax.swing.*;

public class VisualNews {
    public static JTextArea news;

    public static JPanel news() {
        JPanel newPanel = new JPanel();
        newPanel.setBorder(BorderFactory.createTitledBorder("News"));
        newPanel.setLayout(new BoxLayout(newPanel, BoxLayout.Y_AXIS));

        news = new JTextArea(10, 20);
        news.setEditable(false);
        news.setLineWrap(true);

        JScrollPane scrollPaneForNewNews = new JScrollPane(news);
        scrollPaneForNewNews.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneForNewNews.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        newPanel.add(scrollPaneForNewNews);
        return newPanel;
    }
}
