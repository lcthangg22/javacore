
import java.text.DecimalFormat;
import java.util.Scanner;

public class ThuchanhScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();

        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);

        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);

        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);

        float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " +
                decimalFormat.format(thuong));  // làm tròn thương đến 2 chữ số thập phân

        int phanDu = a % b;
        System.out.println(a + " % " + b + " = " + phanDu);

        double luythua = Math.pow(a,b);
        System.out.println(a + " ^ " + b + " = " + luythua);
    }
}