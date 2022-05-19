package demo_exception;

public class DemoUncheckedException {
    public static void main(String[] args) {
        // Mốt số exception phổ biến (ArithmeticException)
        // 1. Chia 1 số cho 0
//        double result = 10/0;
//        System.out.println(result);

        // 2. Thao tác với 1 đối tượng null (NullPointerException)
//        String text = null;
//        System.out.println(text.length());

        // 3. Truy cập vào 1 chỉ số không tồn tại trong mảng (ArrayIndexOutOfBoundsException)
//        int[] numbers = {1,2,3,4};
//        System.out.println(numbers[5]);

        // 4. Tạo 1 mảng với số phần tử là số âm (NegativeArraySizeException)
//        String[] names = new String[-4];

        // 5. Chuyển đổi kiểu dữ liệu (NumberFormatException)
        int number = Integer.parseInt("1a");
        System.out.println(number);
    }
}
