
import factory.CarFactory;
import factory.TeslaFactory;
import factory.VolvoFactory;
import product.Engine;
import product.Software;

public class Client implements CarFactory{

    private CarFactory carFactory;

    public Client(String brand) {
        if(brand.equalsIgnoreCase("tesla"))
            this.carFactory = new TeslaFactory();
        else if(brand.equalsIgnoreCase("volvo"))
            this.carFactory = new VolvoFactory();
    }

    @Override
    public Engine createEngine() {
        return carFactory.createEngine();
    }

    @Override
    public Software createSoftware() {
        return carFactory.createSoftware();
    }
    
}
