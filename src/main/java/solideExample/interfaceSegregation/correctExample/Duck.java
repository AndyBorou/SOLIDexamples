package solideExample.interfaceSegregation.correctExample;

public class Duck implements Fly, Swim {

    public void fly() {
        System.out.println("flying");
    }

    public void swim() {
        System.out.println("swimming");
    }
}
