// The FuelGauge Class
public class FuelGauge{
    private byte fuel;

    /**
     * Create a no-arg default constructor
     */
    public FuelGauge(){

    }

    /**
     * Create a FuelGauge copy constructor
     * @param object2 The FuelGauge object to copy to
     */
    public FuelGauge(FuelGauge object2){
        this.fuel = object2.fuel;
    }


    /**
     * Display the current fuel
     * @return String is returned showing fuel
     */
    public String toString(){
        return "Fuel: " + this.fuel + " gallons";
    }

    /**
     * Increment the fuel only if it is not equal to 15
     */
    public void incrementFuel(){
        this.fuel = (this.fuel != 15) ? ++this.fuel : this.fuel;
    }

    /**
     * Decrement the fuel only if it is not equal to 0
     */
    public void decrementFuel(){
        this.fuel = (this.fuel != 0) ? --this.fuel : this.fuel;
    }
}