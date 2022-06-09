    import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        repeatString();
    }

    public static void repeatString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.print("Số lần sao chép: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(str + "-");
            if (i == n-1) {
                System.out.print(str);
                break;
            }
        }
    }
}