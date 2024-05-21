public class HydrationObserver extends Observer{
    private Plant plant;

    public HydrationObserver(Plant plant){
       this.plant = plant;
       this.plant.attach(this);
    }
    @Override
    public void update() {
        if(plant.getHydration() > 15){
            System.out.println("Your plant is overhydrated!!!");
        }
        else if(plant.getHydration() <= 5){
            System.out.println("Your plant needs hydration!!!");
        }
    }
}
