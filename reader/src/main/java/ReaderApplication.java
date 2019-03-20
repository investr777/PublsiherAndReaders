import config.ConfigNetwork;
import reader.IncomingReader;
import visual.VisualMain;

public class ReaderApplication {
    public static void main(String[] args) {
        VisualMain.go();
        if (args.length == 0){
			System.out.println("Ip and port default");
            ConfigNetwork.setUpNetworking("127.0.0.1", 5000);
        } else {
            ConfigNetwork.setUpNetworking(args[0], Integer.parseInt(args[1]));
        }
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();
    }
}
