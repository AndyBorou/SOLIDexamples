package solideExample.openClosed.incorrectExample;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println(new AreaCalculator().calculate(circle));
        System.out.println(new AreaCalculator().calculate(rectangle));
    }
}
