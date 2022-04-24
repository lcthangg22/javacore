import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IfElseEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println(" Nhập cân nặng (kg) : ");
        double weight = sc.nextDouble();
        System.out.println(" Nhập chiều cao (m) : ");
        double height = sc.nextDouble();
        double BMI = Math.round(weight / Math.pow(height, 2));
        System.out.println(" Với weight = " + weight + " và height = " + height + " thì chỉ số BMI = " + decimalFormat.format(BMI));

        if (BMI < 18.5) {
            System.out.println("Thiếu cân");
        } else if (18.5 <= BMI && BMI <= 24.5) {
            System.out.println("Bình thường");
        } else {
            System.out.println("Thừa cân");
        }
    }
}
