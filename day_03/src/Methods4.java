import java.util.Scanner;

public class Methods4 {
    public static void main(String[] args) {
//        Methods m = new Methods(); // nếu không có static
        Scanner sc = new Scanner(System.in);
        System.out.println("a : ");
        int a = sc.nextInt();
//        m.checkMark(mark);
        checkAB(a);
    }

    public static void checkAB( int a) {
        if (a % 2 == 0) {
            System.out.println("a là số chẵn" );
        }  else {
            System.out.println("a là số lẻ");
        }
    }
}