import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        Methods m = new Methods(); // nếu không có static
        Scanner sc = new Scanner(System.in);
        System.out.println("checkMark : ");
        int mark = sc.nextInt();
//        m.checkMark(mark);
        checkMark(mark);
    }

    public static void checkMark( int mark) {
        if (mark >= 85) {
            System.out.println("A");
        } else if (mark >= 70 && mark < 85) {
            System.out.println("B");
        } else if (mark >=40 && mark < 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
