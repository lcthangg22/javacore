import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
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
                    printArray();
                    break;
                }
                case 3: {
                    chageArrays();
                    break;
                }
                case 4: {
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
        System.out.println("1 - Nhập các phần tử mảng");
        System.out.println("2 - In mảng ra màn hình");
        System.out.println("3 - Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử");
        System.out.println("4 - Thoát\n");
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
        return numbersInput;
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

