package product;
public class VolvoSoftware extends Software{

    @Override
    public void exit() {
        super.run();
        exitVolvoExtention();
    }

    @Override
    public void run() {
        super.run();
        runVolvoExtension();
    }

    public void exitVolvoExtention() {
        System.out.println("exitVolvoExtention()");
    }

    public void runVolvoExtension() {
        System.out.println("runVolvoExtension()");
    }


}
