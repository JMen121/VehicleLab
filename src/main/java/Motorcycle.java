public class Motorcycle extends Vehicle{
    private int mirrors;


    public Motorcycle(int mirrors){
        super("Harley",2,2,true,"diesel");
        this.mirrors= mirrors;

    }

    public String addColour(String colour){
        return "colour added" + colour;
    }

    @Override
    public String makeEngineNoise() {
        return "My noise goes Brrrrr!";
    }

    @Override
    public boolean beepHorn() {
        return true;
    }
}

