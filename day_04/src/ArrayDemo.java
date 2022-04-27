import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cách 1 : Khai báo sau đó gán giá trị cho mảng
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;


        System.out.println(Arrays.toString(numbers)); // in ra mảng ở dạng string
        System.out.println(numbers.length); // độ dài mảng
        System.out.println(numbers[numbers.length - 1]); // phần tử cuối cùng của mảng

        // Cách 2 : Vừa khai báo vừa khởi tạo giá trị cho mảng
        int[] numberOther = {1, 2, 3, 4, 5};

        // Duyệt mảng
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();
        // While
        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j] + "\t");
            j++;
        }
        System.out.println();
        // ForEach : Duyệt qua giá trị, chỉ duyệt xuôi ko duyệt ngược
        for (int number : numbers) {
            System.out.print(number + "\t");
        }

        // Tính tổng
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Tổng = " + total);

        // Tìm giá trị lớn nhất trong mảng
        int max = numbers[0];
        for (int number :
                numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max = " + max);

        // Sắp xếp
        Arrays.sort(numbers); // Sắp xếp tăng dần
        System.out.println("Max = " + numbers[numbers.length - 1]);

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
    }
}
