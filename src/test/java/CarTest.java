import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {


    Car car;

 @BeforeEach
    void setup(){
     car = new Car(true,true);
    }

    @Test
    public void canAddColour(){
     String result = car.addColour("pink");
     assertThat(result).isEqualTo("colour added");
    }



}
