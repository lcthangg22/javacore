public class Calculator {
    public double number1;
    public int number2;

    public int addition() {
        return (int) (number1 + number2);
    }

    public int subtract() {
        return (int) (number1 - number2);
    }

    public int multi() {
        return (int) (number1 * number2);
    }

    public double division() {
        return number1 / number2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
