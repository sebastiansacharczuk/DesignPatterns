public class OffRoadTruck extends VehicleDecorator{
    
    public OffRoadTruck(Vehicle decoratedVehicle){
        super(decoratedVehicle);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        getOffRoadSpecification();
    }

    private void getOffRoadSpecification() {
        System.out.println("+off-road specifications");
    }

}
