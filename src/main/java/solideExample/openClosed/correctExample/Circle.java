package solideExample.openClosed.correctExample;

public class Circle implements Shape{
    public static final double PI = 3.14;
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public int calculateArea(){
        return (int)(radius * PI);
    }
}
