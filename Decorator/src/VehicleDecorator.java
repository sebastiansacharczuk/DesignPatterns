public abstract class VehicleDecorator implements Vehicle{
    protected Vehicle decoratedVehicle;

    public VehicleDecorator(Vehicle decoratedVehicle){
        this.decoratedVehicle = decoratedVehicle;
    }

    @Override
    public void getDescription(){
        decoratedVehicle.getDescription();
    }

}
