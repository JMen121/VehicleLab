

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
        this.fuelType = fuelType;
    }



    public int addPassenger(int addingPassenger){
    int newTotalPassengers= this.numberOfPassengers + addingPassenger;
        return newTotalPassengers;
    }
}
