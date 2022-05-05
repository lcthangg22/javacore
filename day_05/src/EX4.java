import java.util.Scanner;

public class EX4 {
    public static void main(String args[]) {
        int[] date = {1,2,3,4,5};
        System.out.println(checkElementExist(date,3));
        System.out.println(checkElementExist(date,7));
        System.out.println(checkElementExist(date,6));
    }

    public static boolean checkElementExist (int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }
}

