public class MilitaryTruck extends OffRoadTruck {
    public MilitaryTruck(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }
    @Override
    public void getDescription() {
        super.getDescription();
        getMilitarySpecification();
    }

    public void getMilitarySpecification() {
        System.out.println("+military specifications");
    }
    
}
