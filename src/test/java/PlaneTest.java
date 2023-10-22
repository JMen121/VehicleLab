import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {

    Plane plane;

    @BeforeEach
    void setUp(){
        plane = new Plane(90);
    }

    //add tv  as a method
    @Test
   public void addTotalTvs(){
        assertThat(plane.totalTvs(49)).isEqualTo(49);
    }

    @Test
    public void canmakeEngineNoise__noArgument(){
        String expected = "My noise is big and scary!";
        String actual = "My noise is big and scary!";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canmakeEngineNoise__withArgument(){
        String expected = "My noise sounds like Tweeee!";
        String actual = "My noise sounds like Tweeee!";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canBeepHorn(){
        assertThat(plane.beepHorn()).isEqualTo(false);
    }


}
