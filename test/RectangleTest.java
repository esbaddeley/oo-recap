import org.junit.Assert;
import org.junit.Test;

/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class RectangleTest {

    @Test
    public void shouldPass() throws Exception {
        Assert.assertTrue(true);

    }

    @Test
    public void shouldReturnTheAreaOfARectangleAsTen() throws Exception {

        Assert.assertEquals(10, Rectangle.returnArea(5, 2));
    }

    @Test
    public void shouldReturnTheAreaOfARectangleAsTwenty() throws Exception {

        Assert.assertEquals(20, Rectangle.returnArea(5, 4));

    }

    @Test
    public void shouldReturnTheAreaOfRectangleAsThirty() throws Exception {
        Assert.assertEquals(30, Rectangle.returnArea(6, 5));

    }
}
