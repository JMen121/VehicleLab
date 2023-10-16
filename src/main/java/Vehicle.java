import org.junit.Test;

public class Vehicle {

    private String brandName;

    private int numberOfWheels;

    private int numberOfPassengers;

    private boolean publicTransport;

    private String fuelType;

    public Vehicle (String brandName, int numberOfWheels, int numberOfPassengers,
                    boolean publicTransport,String fuelType){
        this.brandName= brandName;
        this.numberOfWheels = numberOfWheels;
        this.numberOfPassengers = numberOfPassengers;
        this.publicTransport = publicTransport;
    }


    public int addPassenger(){  
     int newTotalPassengers= this.numberOfPassengers + addPassenger();
        return newTotalPassengers;
    }
}
