package demo_exception;

import java.io.IOException;

public class DemoThrowAndThrows {
    public static void main(String[] args) {
        try {
            validateAge(20);
            validateAge(16);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Code continue ...");
        try {
            demo();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validateAge(int age) {
        if (age<18) {
            throw new ArithmeticException("Không đủ tuổi đi nghĩa vụ quân sự");
        }
        System.out.println("Đủ tuổi đi nghãi vụ quân sự");
    }

    public static void demo() throws IOException {
        throw new IOException("Không tìm thấy file!");
    }
}
