import java.util.Arrays;

public class EX2 {
    public static void main(String[] args) {
        System.out.println(repeatString("a"));
    }
    public static String repeatString(String str) {
        String[] s = new String[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = str;
        }
        return String.join("",s);
    }
}
