import config.ConfigNetwork;
import visual.VisualMain;

public class PublisherApplication {
    public static void main(String[] args) {
        VisualMain.go();
        if (args.length == 0) {
            System.out.println("Port default");
            ConfigNetwork.startServer(5000);
        } else {
            ConfigNetwork.startServer(Integer.parseInt(args[0]));
        }
    }
}
