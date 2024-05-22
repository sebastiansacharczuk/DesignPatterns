package factory;
import product.Software;
import product.Engine;

public interface CarFactory {
    public Software createSoftware();
    public Engine createEngine();
}
