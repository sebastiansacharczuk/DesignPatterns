package product;
public class TeslaSoftware extends Software{

    @Override
    public void exit() {
        super.run();
        exitTeslaExtention();
    }

    @Override
    public void run() {
        super.run();
        runTeslaExtension();
    }

    public void exitTeslaExtention() {
        System.out.println("exitTeslaExtention()");
    }

    public void runTeslaExtension() {
        System.out.println("runTeslaExtension()");
    }
}
