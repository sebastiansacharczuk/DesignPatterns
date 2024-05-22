package factory;
import product.Engine;
import product.Software;
import product.VolvoEngine;
import product.VolvoSoftware;

public class VolvoFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new VolvoEngine();
    }

    @Override
    public Software createSoftware() {
        return new VolvoSoftware();
    }

}
