package demo_exception;

import java.io.IOException;

public class DemoCallstackCheck {
    public static void main(String[] args) {
        try {
            methodThree();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Code continue ...");
    }
    public static void methodOne() throws IOException {
        throw new IOException("Không tìm thầy file");
    }

    public static void methodTwo() throws IOException {
        methodOne();
    }

    public static void methodThree() throws IOException {
        methodTwo();
    }
}
