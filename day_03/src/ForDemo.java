import java.util.Random;
import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        // Thực hiện công việc "Thức dậy lúc 7h" lặp đi lặp lại trong vòng 30 ngày

//        for (int day = 1;day <= 30; day++) {
//            System.out.println("Ngày " + day + " thức dậy lúc 7h");
//        }

        // Thực hiện công việc "Thức dậy lúc 7h" vào những ngày lẻ, ngày chẵn bỏ qua
//        for (int day = 1;day <= 30; day++) {
//           if(day % 2 == 1) {
//               System.out.println("Ngày " + day + " thức dậy lúc 7h");
//           }
//        }
//        for (int day = 1;day <= 30; day += 2) {
//                System.out.println("Ngày " + day + " thức dậy lúc 7h");
//        }
//
        // Break
//        for (int day = 1; day <= 30; day++) {
//            if (day == 20) {
//                System.out.println("Không thực hiện nữa");
//                break;
//            }
//
//            System.out.println("Ngày " + day + " thức dậy lúc 7h");
//        }
//
//        // continue : Nghỉ xa hơi vào những ngày cuối tuần
//        for (int day = 1; day <= 30; day++) {
//            if (day % 7 == 0) {
//                System.out.println("Nghỉ xả hơi, ngủ nướng");
//                continue;
//            }
//
//            System.out.println("Ngày " + day + " thức dậy lúc 7h");
//        }

        // Tính tổng tiền tiết kiệm
        // Trong vòng 10 ngày, mỗi ngày tiết kiệm 100k => 1000k

        // Khi chưa bắt đầu thì số tiền đang có là 0k
        int money = 0;
        for (int day = 1; day <= 10; day++){
//            money = money + 100_000;
            money += 100_000;
        }

        System.out.println("Số tiền tiết kiệm được là : " + money);

        // Random n số ngẫu nhiên trong khoảng 0 -> 100. Nhập vào từ bàn phím
//        Scanner sc = new Scanner(System.in);
//        Random rd = new Random();
//
//        System.out.println("Bạn muốn random bao nhiêu số : ");
//        int count = sc.nextInt();
//
//        for (int i = 0; i < count; i++) {
//            int numberRandom = rd.nextInt(100);
//            if (numberRandom > 90) {
//                break;
//            }
//            System.out.print(numberRandom + "\t");
//        }
    }
}
