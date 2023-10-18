import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle>vehicle;
    public Garage (){
       this.vehicle = new ArrayList<>();
    }

    public int countVehicles(){
        return this.vehicle.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicle.add(vehicle);
    }


}
