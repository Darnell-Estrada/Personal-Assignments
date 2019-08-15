// The Odometer Class
public class Odometer{
    private int mileage;
    private FuelGauge gauge;

    /**
     * Initialize the gauge variable to a copy
     * @param gauge FuelGauge object
     */
    public Odometer(FuelGauge gauge){
        this.gauge = new FuelGauge(gauge);
    }

    /**
     * Get FuelGauge object copy
     * @return FuelGauge object copy is returned
     */
    public FuelGauge getGauge(){
        return new FuelGauge(this.gauge);
    }

    /**
     * Display current mileage
     * @return String is returned showing mileage
     */
    public String toString(){
        return "Mileage: " + this.mileage + " miles";
    }

    /**
     * Increment mileage if its value is not 99999
     * and overwrite the mileage to 0 if it is
     */
    public void incrementMileage(){
        this.mileage = (this.mileage != 999999) ? ++this.mileage : 0;
    }

    /**
     * Decrement fuel if mileage is not 0 and divisible by 24
     */
    public void decrementFuel(){
        if (this.mileage != 0 && this.mileage % 24 == 0)
            this.gauge.decrementFuel();
    }
}
