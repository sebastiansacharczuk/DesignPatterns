public class App {
    public static void main(String[] args) throws Exception {

        Plant plant = new Plant(13, true, 12);
        TemperatureObserver temperatureObserver = new TemperatureObserver(plant);
        HydrationObserver hydrationObserver = new HydrationObserver(plant);
        SunlightObserver sunlightObserver = new SunlightObserver(plant);
        
        System.out.println(1);
        plant.setHydration(30);
        System.out.println(2);
        plant.setSunlight_exposure(false);
        System.out.println(3);
        plant.setTemperature(23);
        System.out.println(4);
        plant.setTemperature(15);
        plant.setHydration(14);
        plant.setSunlight_exposure(true);
    }
}
