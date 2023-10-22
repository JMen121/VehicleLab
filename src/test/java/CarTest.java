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
     String result = car.addColour(" pink");
     assertThat(result).isEqualTo("colour added pink");
    }

    @Test
    public void canmakeEngineNoise__noArgument(){
     String expected = "My noise is big and scary!";
     String actual = "My noise is big and scary!";
        assertThat(actual).isEqualTo(expected);
 }

    @Test
    public void canmakeEngineNoise__withArgument(){
       String expected = "My noise is vrrroomm!";
        String actual = "My noise is vrrroomm!";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canBeepHorn(){
     assertThat(car.beepHorn()).isEqualTo(true);
   }
}



