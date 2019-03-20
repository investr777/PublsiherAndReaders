package reader;

import config.ConfigNetwork;
import visual.VisualNews;

public class IncomingReader implements Runnable {
    public void run() {
        String message;
        try {
            while (!(message = ConfigNetwork.reader.readLine()).equals(null)) {
                if (!message.equals("")) {
                    VisualNews.news.append(message + "\n");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}