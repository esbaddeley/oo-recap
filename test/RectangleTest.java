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
        Rectangle rectangle = new Rectangle(5, 2);
        Assert.assertEquals(10, rectangle.returnArea());
    }

    @Test
    public void shouldReturnTheAreaOfARectangleAsTwenty() throws Exception {
        Rectangle rectangle = new Rectangle(5, 4);
        Assert.assertEquals(20, rectangle.returnArea());

    }

    @Test
    public void shouldReturnTheAreaOfRectangleAsThirty() throws Exception {
        Rectangle rectangle = new Rectangle(6, 5);
        Assert.assertEquals(30, rectangle.returnArea());

    }


}
