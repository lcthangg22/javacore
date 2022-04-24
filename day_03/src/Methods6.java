import java.util.Scanner;

public class Methods6 {
    public static void main(String[] args) {
//        Methods m = new Methods(); // nếu không có static
        Scanner sc = new Scanner(System.in);
        System.out.println("a : ");
        int a = sc.nextInt();
        System.out.println("b : ");
        int b = sc.nextInt();
        System.out.println("c : ");
        int c = sc.nextInt();
//        m.checkMark(mark);
        checkAB(a,b,c);
    }

    public static void checkAB( int a, int b, int c) {
        if (c == a + b) {
            System.out.println("YES");
        }  else {
            System.out.println("NO");
        }
    }
}