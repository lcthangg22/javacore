package demo_override;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat...");
    }

    public void sleep() {
        System.out.println("Dog sleep...");
    }
}
