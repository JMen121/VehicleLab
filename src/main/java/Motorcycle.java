public class Motorcycle extends Vehicle{
    private int mirrors;

    public Motorcycle(int mirrors){
        super("Harley",2,2,true,"diesel");
        this.mirrors= mirrors;
    }


    public String addcolour(String colour){
        return "colour added" + colour;
    }
}
