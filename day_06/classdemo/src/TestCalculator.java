public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.number1 = 20;
        calculator.number2 = 40;

        System.out.println(calculator);
        System.out.println(calculator.addition());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multi());
        System.out.println(calculator.division());
    }
}
