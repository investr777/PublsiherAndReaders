import config.ConfigNetwork;
import reader.IncomingReader;
import visual.VisualMain;

public class ReaderApplication {
    public static void main(String[] args) {
        VisualMain.go();
        if (args[0].equals(null) || args[1].equals(null)){
            ConfigNetwork.setUpNetworking("127.0.0.1", 5000);
            System.out.println("Ip and port default");
        } else {
            ConfigNetwork.setUpNetworking(args[0], Integer.parseInt(args[1]));
        }
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();
    }
}
