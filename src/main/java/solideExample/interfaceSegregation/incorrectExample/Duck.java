package solideExample.interfaceSegregation.incorrectExample;

public class Duck implements BirdProperties {

    public void fly() {
        System.out.println("flying");
    }

    public void swim() {
        System.out.println("swimming");
    }
}
