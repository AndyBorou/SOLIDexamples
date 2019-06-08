package solideExample.liskovSubstitution.correctExample;


public class Main {
    static Rectangle getRectangle(){
        return new Rectangle();
    }

    public static void main(String[] args){

        Rectangle rectangle = getRectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        System.out.println(rectangle.getSquare());
    }
}

interface Shape{
    int getSquare();
}

class Rectangle implements Shape{

    int width;
    int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSquare(){
        return width * height;
    }
}

class Square implements Shape{

    int widthAndHeight;

    public void setWidth(int widthAndHeight) {
        this.widthAndHeight = widthAndHeight;
    }

    public int getSquare() {
        return widthAndHeight * widthAndHeight;
    }
}
