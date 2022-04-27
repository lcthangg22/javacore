import java.util.Arrays;
import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = sc.nextInt();

            switch (option) {
                case 1: {
                    creatArrays();
                    break;
                }
                case 2: {
                    inputArrays();
                    break;
                }
                case 3: {
                    printArray();
                    break;
                }
                case 4: {
                    chageArrays();
                    break;
                }
                case 5: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n MENU ");
        System.out.println("1 - Chức năng 1");
        System.out.println("2 - Chức năng 2");
        System.out.println("3 - Chức năng 3");
        System.out.println("4 - Thoát\n");
    }

    public static int[] creatArrays() {
        Scanner sc = new Scanner(System.in);
        // Nhập mảng
        System.out.print("Nhập vào số phần tử của mảng: ");
        int count = sc.nextInt();
        return new int[count];
    }

    public static void inputArrays() {
        // Nhập vào phần tử của mảng
        Scanner sc = new Scanner(System.in);
        int[] numbersInput = creatArrays();
        int i = 0;
        while (i < numbersInput.length) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + " : ");
            numbersInput[i] = sc.nextInt();
            i++;
        }
    }

    public static void printArray() {
        // In ra mảng vừa nhập
        System.out.print("Mảng vừa nhập là : " + Arrays.toString(creatArrays()));
    }

    public static void chageArrays() {
        // Thay đổi
        int[] numbersInput = creatArrays();
        for (int i = 0; i < numbersInput.length; i++) {
            if (numbersInput[i] % 2 == 0) {
                numbersInput[i] += 1;
            }
        }
        System.out.println("\nThay đổi = " + Arrays.toString(numbersInput));
    }
}