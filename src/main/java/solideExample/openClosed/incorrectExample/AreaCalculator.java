package solideExample.openClosed.incorrectExample;

public class AreaCalculator {

    public int calculate(Object object){

        int area;

        if (object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle)object;
            area = rectangle.width* rectangle.height;
        } else {
            Circle circle = (Circle) object;
            area = (int)(circle.radius * circle.PI);
        }
        return area;
    }

}
