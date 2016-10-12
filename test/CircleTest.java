import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class CircleTest {

    @Test
    public void shouldReturnArea() throws Exception {
        Circle circle = new Circle();
        Assert.assertEquals(0, circle.returnArea());

    }
}
