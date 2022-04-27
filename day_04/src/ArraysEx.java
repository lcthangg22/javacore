import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx {
    public static void main(String[] args) {
        // Nhập
        int [] numberInput = creatArrays();

        // Tính tổng
        System.out.println("Tổng của mảng = " + sumArrays(numberInput));

        // Tìm số lớn nhất
        System.out.println("Max = " + findMax(numberInput));
    }

    public static int[] creatArrays() {
        Scanner sc = new Scanner(System.in);
        // Nhập mảng
        System.out.print("Nhập vào số phần tử của mảng: ");
        int count = sc.nextInt();
        int[] numbersInput = new int[count];

        // Nhập vào phần tử của mảng
        for (int i = 0; i < numbersInput.length; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + " : ");
            numbersInput[i] = sc.nextInt();
        }

        // In ra mảng vừa nhập
        System.out.print("Mảng vừa nhập là : " + Arrays.toString(numbersInput));
        return numbersInput;
    }

    public static int sumArrays(int[] arr) {
        int total = 0;
        for (int number: arr) {
            total += number;
        }
        return total;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int number :
                arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
