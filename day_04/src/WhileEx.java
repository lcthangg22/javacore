import java.util.Random;
import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int randomNumber = rd.nextInt(100);
//        while (true) {
//            System.out.println("Nhập số: ");
//            int a = sc.nextInt();
//            if (a == 0) {
//                System.out.println("Số phải khác 0. Nhập lại");
//            } else {
//                System.out.println("Số vừa nhập là: " + a);
//                break;
//            }
//        }

        while (true) {
            System.out.println("Nhập số: ");
            int userNumber = sc.nextInt();
            if (userNumber > randomNumber) {
                System.out.println("Bạn nhập số lớn hơn rồi, cho nhập lại");
                System.out.println(randomNumber);
            } else if (userNumber < randomNumber) {
                System.out.println("Bạn nhập số nhỏ hơn rồi, cho nhập lại");
                System.out.println(randomNumber);
            } else {
                System.out.println("Chúc mừng bạn nhập đúng rồi");
                System.out.println(randomNumber);
                break;
            }
        }

    }
}
