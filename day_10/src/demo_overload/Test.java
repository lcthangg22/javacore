package demo_overload;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3,4));
        System.out.println(calculator.sum(3,4,5));
        System.out.println(calculator.sum(4.5,5.5));

        String name = "A";

    }
}
