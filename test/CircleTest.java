import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class CircleTest {

    @Test
    public void shouldReturnArea() throws Exception {
        Circle circle = new Circle(2);
        Assert.assertEquals((Math.PI*4), circle.returnArea(), 0.001);

    }
}
