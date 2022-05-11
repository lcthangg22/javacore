public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("bob", "black",4);
        System.out.println(dog);

        dog.setColor("white");
        System.out.println(dog);
        dog.eat();
    }
}
