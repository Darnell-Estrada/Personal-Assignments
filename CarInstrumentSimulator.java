// CarInstrumentSimulator Demo
public class CarInstrumentSimulator{
    public static void main(String[] args){

        // FuelGauge object instantiation
        FuelGauge gauge = new FuelGauge();

        // Fill the car with fuel
        for (byte i = 0; i < 20; i++){
            gauge.incrementFuel();
            System.out.println(gauge);
        }

        // Print a space
        System.out.println();

        // Odometer object instantiation
        Odometer meter = new Odometer(gauge);

        // Run the car until it runs out of fuel
        for (int i = 0; i < 100; i++){
            meter.incrementMileage();
            meter.decrementFuel();
            System.out.println(meter + "\t\t" + meter.getGauge());
        }
    }
}