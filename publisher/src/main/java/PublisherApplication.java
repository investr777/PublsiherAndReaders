import config.ConfigNetwork;
import visual.VisualMain;

public class PublisherApplication {
    public static void main(String[] args) {
        VisualMain.go();
        if (args[0].equals(null)) {
            ConfigNetwork.startServer(5000);
            System.out.println("Port default");
        } else {
            ConfigNetwork.startServer(Integer.parseInt(args[0]));
        }
    }
}
