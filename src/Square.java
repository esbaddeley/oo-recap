/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class Square {

    private final int width;
    private final int height;

    public Square(int width,int height) throws NotSquareException{

        if (width != height){
            throw new NotSquareException("Not a Square");
        }
        this.width = width;
        this.height = height;
    }

    public int returnArea() {
        return width * height;
    }


}
