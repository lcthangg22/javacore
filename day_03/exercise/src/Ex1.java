import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(repeatString("a"));
    }

    public static String repeatString(String str) {
        String a = str;
        for (int i = 0; i < 10; i++) {
            str += a;
        }
        return str;

    }
}