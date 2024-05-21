public class TemperatureObserver extends Observer{

   private Plant plant;

   public TemperatureObserver(Plant plant){
      this.plant = plant;
      this.plant.attach(this);
   }

   public void update() {
      if(plant.getTemperature() > 21){
         System.out.println("Temperature is too high!!!");
      }
      else if(plant.getTemperature() <= 10) {
         System.out.println("Temperature is too low!!!");
      }
   }
}