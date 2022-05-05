
import java.util.Arrays;
import java.util.Random;

public class EX {
    //method01
    public static int[] formatArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i] % 2;
        }
        return arr1;
    }

    //method2
    public static String repeatString(String str) {
        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = str;
        }
        return String.join("", arr);
    }

    //method3
    public static String repeatString2(String str) {
        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = str;
        }
        return String.join("-", arr);
    }

    //method 4
    public static boolean checkIndexExist(int[] arr, int a) {
        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                isExist = true;
            }
        }
        return isExist;
    }

    public static String randomHEX() {
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


    //method5
    public static String randomRGB() {
        Random rd = new Random();
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(rd.nextInt(256));
        }
        return "rgb(" + String.join(",", arr) + ")";

    }

    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = {4, 2, 5, 6, 2, 7};
        System.out.println(Arrays.toString(formatArray(arr)));
        System.out.println(repeatString("a"));
        System.out.println(repeatString2("a"));
        System.out.println(checkIndexExist(arr, 4));
        System.out.println(checkIndexExist(arr, 10));
        System.out.println(randomHEX());
        System.out.println(randomRGB());
        System.out.println(rd.nextInt(50 - 10 + 1) + 10);//(max - min + 1) + min
    }
}

