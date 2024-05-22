import product.Engine;
import product.Software;

public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client("tesla");
        Engine engine = client.createEngine();
        Software software = client.createSoftware();
        engine.start();
        software.run();
        client = new Client("volvo");
        engine = client.createEngine();
        software = client.createSoftware();
        engine.start();
        software.run();
        
    }
}
