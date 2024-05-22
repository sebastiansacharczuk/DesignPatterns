package factory;
import product.Engine;
import product.Software;
import product.TeslaEngine;
import product.TeslaSoftware;

public class TeslaFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new TeslaEngine();
    }

    @Override
    public Software createSoftware() {
        return new TeslaSoftware();
    }
    
}
