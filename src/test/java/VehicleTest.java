import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle; //this gives the whole test a scope, creating the variable that would hold the object.
    // It will run before each test to create the animal object


    @BeforeEach
    void setUp(){
        vehicle = new Motorcycle(2);
        };


    @Test
    public void canAddPassengers() {
        assertThat(vehicle.addPassenger(20)).isEqualTo(22);
    }


    @Test
    void makeEngineNoise() { assertThat(vehicle.makeEngineNoise()).isEqualTo("My noise is big and scary!");
    }


}
