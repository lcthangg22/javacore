import java.util.Scanner;

public class Methods5 {
    public static void main(String[] args) {
//        Methods m = new Methods(); // nếu không có static
        Scanner sc = new Scanner(System.in);
        System.out.println("a : ");
        int a = sc.nextInt();
//        m.checkMark(mark);
        checkAB(a);
    }

    public static void checkAB( int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("a chia hết cho 3 và 5." );
        }  else {
            System.out.println("a không chia hết cho 3 và 5.");
        }
    }
}
