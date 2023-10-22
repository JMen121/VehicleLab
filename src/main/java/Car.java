public class Car extends Vehicle {
    private boolean automatic;

    private boolean electric;

    public Car (boolean automatic, boolean electric){
        super("Benz",4,4, true,"petrol");
        this.automatic= automatic;
        this.electric= electric;
    }


    public String addColour(String colour){
         return "colour added" + colour;
    }

    @Override
    public String makeEngineNoise() {
        return "My noise is vrrroomm!";
    }
    //Example of method override - has been override in the vehicle.java methods
}

