package solideExample.openClosed.correctExample;

public class Rectangle implements Shape{
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea(){
        return width * height;
    }
}
