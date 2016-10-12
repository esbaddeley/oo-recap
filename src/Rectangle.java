/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class Rectangle {


    private final int width;
    private final int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int returnArea() {
        return width * height;
    }
}
