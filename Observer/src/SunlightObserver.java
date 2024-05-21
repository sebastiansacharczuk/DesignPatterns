public class SunlightObserver extends Observer{
    private Plant plant;

    public SunlightObserver(Plant plant){
        this.plant = plant;
        this.plant.attach(this);
    }

    public void update() {
        if(!plant.isSunlight_exposure()){
            System.out.println("Your plant needs sunlight!!!");
        }
    }
}
