import java.util.ArrayList;

public class Plant extends Subject{
	
   private double temperature;
   private double hydration;
   private boolean sunlight_exposure;

   public Plant(double hydration, boolean sunlight_exposure, double temperature) {
      this.hydration = hydration;
      this.sunlight_exposure = sunlight_exposure;
      this.temperature = temperature;
      this.observers = new ArrayList<>();
   }
   
   @Override
   public void attach(Observer observer){
      observers.add(observer);		
   }
   
   @Override
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	

   public double getTemperature() {
      return temperature;
   }

   public void setTemperature(double temperature) {
      this.temperature = temperature;
      notifyAllObservers();
   }

   public double getHydration() {
      return hydration;
   }

   public void setHydration(double hydration) {
      this.hydration = hydration;
      notifyAllObservers();
   }

   public boolean isSunlight_exposure() {
      return sunlight_exposure;
   }

   public void setSunlight_exposure(boolean sunlight_exposure) {
      this.sunlight_exposure = sunlight_exposure;
      notifyAllObservers();
   }
}