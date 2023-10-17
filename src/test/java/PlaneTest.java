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
       // assertThat(plane.totalTvs(469)).is equalToThat;
    }


}
