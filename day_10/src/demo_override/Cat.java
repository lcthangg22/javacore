package demo_override;

public class Cat extends Animal  {
    @Override
    public void sound() {
        System.out.println("Cat meo meo...");
    }

    public void play() {
        System.out.println("Cat play...");
    }
}
