package demo_interface;

public class Square implements IShape{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public void printInfo() {
        System.out.println("Side = " + side);
    }

    @Override
    public void getSide() {
        System.out.println("Square have 4 sides");
    }
}
