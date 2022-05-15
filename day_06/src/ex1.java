import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        tamGiac();
        hinhVuong();
    }
    public static void tamGiac() {
        Scanner sc = new Scanner(System.in);
        int hight;
        System.out.print("Nhập vào chiều cao : ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hinhVuong() {
        Scanner sc = new Scanner(System.in);
        int hight;
        System.out.print("Nhập vào chiều cao : ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= hight; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
