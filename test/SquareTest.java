import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class SquareTest {

    @Test
    public void shouldReturnAreaOfASqureAsFour() throws Exception {
        Square square = new Square(2, 2);
        assertEquals(4, square.returnArea());
    }

    @Test
    public void shouldReturnAreaOfASquareAs6() throws Exception {
        Square square = new Square(3, 3);
        assertEquals(9, square.returnArea());

    }

    @Test
    public void shouldThrowExceptionIfNotSquare() throws Exception {
        try {
            Square square = new Square(2, 5);
            assertTrue(false);
        }
        catch (NotSquareException notSquare){
            assertEquals("Not a Square", notSquare.getMessage());
        }
    }


}
