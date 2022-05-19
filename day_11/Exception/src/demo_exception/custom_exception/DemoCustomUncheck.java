package demo_exception.custom_exception;

public class DemoCustomUncheck {
    public static void main(String[] args) {
        try {
            findElenment(6);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean findElenment (int value) {
        int[] numbers = {1,2,3,4,5};
        for (int number: numbers) {
            if (number == value) {
                return true;
            }
        }
        throw new NotFoundException("Không tìm thấy phần tử có giá trị = " + value);
    }
}
