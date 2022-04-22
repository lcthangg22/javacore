import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Chiều dài");
        int a = sc.nextInt();
        System.out.println("Chiều rộng");
        int b = sc.nextInt();

        int chuvi = ( a + b ) * 2;
        System.out.println("(" + a + " + " + b + ")" + " * " + 2 + " = " + chuvi);

        int dientich = a * b;
        System.out.println(a + " * " + b + " = " + dientich);

    }
}
