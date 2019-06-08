package solideExample.liskovSubstitution.incorrectExample;

public class Main {

    static Rectangle getRectangle(){
        return new Square();
    }

    public static void main(String[] args){

        Rectangle rectangle = getRectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        System.out.println(rectangle.getSquare());
    }
}

class Rectangle{
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

class Square extends Rectangle {
    public void setWidth(int width) {
        this.width = width;
        height = width;
    }

    public void setHeight(int height) {
        this.height = height;
        width = height;
    }
}
