/**
 * Created by emmabaddeley on 12/10/2016.
 */
public class Circle {


    private final int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double returnArea() {
        return (Math.PI * (radius * radius));
    }
}
