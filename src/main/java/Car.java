public class Car extends Vehicle {
    private boolean automatic;

    private boolean electric;

    public Car (boolean automatic, boolean electric){
        super();
        this.automatic= automatic;
        this.electric= electric;
    }


    public String addColour(String colour){
         return "colour added" + colour;
    }


}

