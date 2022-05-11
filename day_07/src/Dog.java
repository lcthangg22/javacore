public class Dog extends Animal {
    private int leg;

    public Dog() {
    }

    public Dog(String name, String color, int leg) {
        super(name, color);
        this.leg = leg;
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Dog eat ...");
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "leg=" + leg  + " name=" + super.getName() + " color=" + super.getColor() +
                '}';
    }
}
