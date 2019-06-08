package solideExample.openClosed.correctExample;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        AreaCalculator areaCalculator = new AreaCalculator();


        System.out.println(areaCalculator.calculate(circle));
        System.out.println(areaCalculator.calculate(rectangle));
    }
}
