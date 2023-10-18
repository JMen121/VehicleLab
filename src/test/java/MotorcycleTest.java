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
        String result = motorcycle.addColour("red");
        assertThat(result).isEqualTo("colour added");
    }
}
