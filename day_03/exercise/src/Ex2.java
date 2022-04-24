import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        repeatString();
    }

    public static void repeatString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi : ");
        String str = sc.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.print(str + "-");
            if (i == 9) {
                System.out.print(str);
                break;
            }
        }
    }
}