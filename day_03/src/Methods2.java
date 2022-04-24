import java.util.Scanner;

public class Methods2 {
    public static void main(String[] args) {
//        Methods m = new Methods(); // nếu không có static
        Scanner sc = new Scanner(System.in);
        System.out.println("a : ");
        int a = sc.nextInt();
        System.out.println("b : ");
        int b = sc.nextInt();
//        m.checkMark(mark);
        checkAB(a,b);
    }

    public static void checkAB( int a, int b) {
        if (a > b) {
            System.out.println("a = " + a);
        }  else {
            System.out.println("b = " + b);
        }
    }
}