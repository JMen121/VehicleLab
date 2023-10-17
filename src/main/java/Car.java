public class Car {
    private boolean automatic;

    private boolean electric;

    public Car (boolean automatic, boolean electric){
        this.automatic= automatic;
        this.electric= electric;
    }


    public String addColour(String colour){
         return "colour added" + colour;
    }
}

