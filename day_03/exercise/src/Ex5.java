import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính : ");
        double r = sc.nextDouble();
        Vhinhcau(r);
    }

    public static void Vhinhcau( double r) {
        double V = 4/3 * Math.PI * Math.pow(r,3) ;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Thể tích hình cầu là: " + decimalFormat.format(V));
    }
}
