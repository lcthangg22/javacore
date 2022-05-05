import java.util.Random;

public class EX6 {
    public static void main(String[] args) {
        System.out.println(randomRGB());
    }
    public static String randomRGB() {
        Random rd = new Random();
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(rd.nextInt(256));
        }
        return "rgb(" + String.join(",", arr) + ")";

    }
}
