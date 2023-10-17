public class Plane {

    private int window;

    public Plane (int window) {
        this.window = window;
    }


    //adding tvs
    //I want to add the same amount of tvs as the amount of passengers

    public int totalTvs (int numberOfPassenger, int addTv){
        int totalTVs = numberOfPassenger + addTv;
        return totalTVs;
    }
    
}
