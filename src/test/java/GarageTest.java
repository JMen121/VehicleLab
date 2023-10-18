import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    Garage garage;

    @BeforeEach
    void setUp(){
    garage= new Garage();
    }

    @Test
    void canCountVehicles(){
        assertThat(garage.countVehicles()).isEqualTo(0);
    }

    @Test
    void canAddVehicles(){
       Car car = new Car(false,false);
        Motorcycle motorcycle = new Motorcycle(5);
        garage.addVehicle(car);
        garage.addVehicle(motorcycle);
        assertThat(garage.countVehicles()).isEqualTo(2);

   }


}
