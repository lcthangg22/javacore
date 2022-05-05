import java.util.Random;

public class EX5 {
    public static void main(String[] args) {
        System.out.println(randomHexCode());
    }


    public static String randomHexCode() {
        Random rd = new Random();
        String[] arr = {"a", "b", "c", "d", "e", "f", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] arr1 = new String[7];
        arr1[0] = "#";
        for (int i = 1; i <= 6; i++) {
            int location = rd.nextInt(arr.length);
            arr1[i] = arr[location];
        }
        return String.join("", arr1);
    }
}
