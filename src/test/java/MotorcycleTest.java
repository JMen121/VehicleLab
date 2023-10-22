import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorcycleTest {

    Motorcycle motorcycle;

    @BeforeEach
    void setUp(){
        motorcycle = new Motorcycle(2);
    }

    @Test
    public void canAddColour(){
        String result = motorcycle.addColour(" red");
        assertThat(result).isEqualTo("colour added red");
    }

    @Test
    public void canmakeEngineNoise__noArgument(){
        String expected = "My noise is big and scary!";
        String actual = "My noise is big and scary!";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canmakeEngineNoise__withArgument(){
        String expected = "My noise goes Brrrrr!";
        String actual = "My noise goes Brrrrr!";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canBeepHorn(){
        assertThat(motorcycle.beepHorn()).isEqualTo(true);
    }
}
