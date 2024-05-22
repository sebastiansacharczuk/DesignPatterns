package product;
public class VolvoEngine extends Engine{

    @Override
    public void start() {
        super.start();
        startVolvoExtention();
    }

    @Override
    public void stop() {
        super.stop();
        stopVolvoExtention();
    }
    
    public void startVolvoExtention() {
        System.out.println("startVolvoExtention()");
    }

    public void stopVolvoExtention() {
        System.out.println("stopVolvoExtension()");
    }
}
