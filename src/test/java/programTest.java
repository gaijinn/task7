import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class programTest {

    private Rectangle3D rectangle3D;

    @Test
    public void can_create_class_test(){
        Rectangle3D rectangle3D = new Rectangle3D();
    }

    @Before
    public void set_up(){
        rectangle3D = new Rectangle3D();
    }

    @Test
    public void can_show_parameters_test(){
        rectangle3D.showParameters();
    }

    @Test
    public void can_calculate_rectangle_area(){
        rectangle3D.getArea();
    }

    @Test
    public void can_get_height_test(){
        rectangle3D.getHeight();
    }

    @Test
    public void can_get_width_test(){
        rectangle3D.getWidth();
    }

    @Test
    public void can_get_length_test(){
        rectangle3D.getLength();
    }

    @Test
    public void area_with_parameters_three_three_three_is_eual_to_fixtyFour(){
        assertEquals(5,rectangle3D.getArea(),0.5);
    }
}
