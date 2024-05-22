package product;
public class TeslaEngine extends Engine{
    @Override
    public void stop() {
        super.stop();
        stopTeslaExtention();
    }

    @Override
    public void start() {
        super.start();
        startTeslaExtention();
    }
    
    public void startTeslaExtention() {
        System.out.println("startTeslaExtention()");
    }

    public void stopTeslaExtention() {
        System.out.println("stopTeslaExtension()");
    }
}
