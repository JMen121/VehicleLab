public class Plane extends Vehicle {

    private int window;

    private int tv;

    public Plane(int window) {
        super("britishAirways", 6, 469,
                false, "diesel");
        this.window = window;
        this.tv = tv;
    }

    //adding tvs
    //I want to add the same amount of tvs as the amount of passengers

    /* public int totalTvs (int numberOfPassenger, int addTv){
        int totalTVs = numberOfPassenger + addTv;
        return totalTVs;
    }*/

    public int totalTvs(int numberOfPassengers) {
        this.tv = numberOfPassengers;
        return numberOfPassengers;
    }

    @Override
    public String makeEngineNoise() {
        return "My noise sounds like Tweeee!";
    }

    @Override
    public boolean beepHorn() {
        return false;
    }
}
