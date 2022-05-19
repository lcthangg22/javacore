package demo_exception;

import java.io.*;

public class DemoHandleException {
    public static void main(String[] args) {
        // Xử lý với try/catch
        // Try : chứa code có thể xảy ra lỗi
        // Catch : Xử lý lỗi nếu xảy ra
        try {
            double result = 10 / 0;
            System.out.println(result);
        } catch (
                ArithmeticException e) {
            System.out.println("Có lỗi xảy ra!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // Xử lý nhiều exception
//        try {
//            // ArithmeticException
//            double result = 10 / 2;
//            System.out.println(result);
//
//            // NullPointerException
//            String text = null;
//            System.out.println(text.length());
//        } catch (ArithmeticException | NullPointerException e) {
//            System.out.println("Có lỗi xảy ra!");
//            System.out.println(e.getMessage());
//        }
//        catch (RuntimeException e){}

//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
        // finally : Được chạy kể cả có xảy ra lỗi hay không
//        try {
//            double result = 10 / 0;
////            double result = 10 / 2;
//            System.out.println(result);
//        } catch (
//                ArithmeticException e) {
//            System.out.println("Có lỗi xảy ra!");
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Code continue...");
//        }
//
//        // Xử lý ngoại lệ checked
//        try {
//            // Khởi tạo 1 đối tượng file
//            File file = new File("text.txt");
//
//            // Đọc file
////            FileReader fileReader = new FileReader(file);
//            FileInputStream fileInputStream = new FileInputStream(file);
//
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
////            String s;
////            while (s= bufferedInputStream.readLine()) != null) {
////                System.out.println(s);
////            }
//
//            // Đọc 2 dòng trong file
//            for (int i = 0; i < 2; i++) {
//                System.out.println();
//            }
//
//        }
////        } catch (IOException e)
//        catch (IOException e) {
//            System.out.println("Lỗi xảy ra khi thao tác với file!");
//            System.out.println(e.getMessage());
//        }
    }
}
