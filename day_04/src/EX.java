import java.util.Arrays;
import java.util.Scanner;

public class EX {
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
                    ex1();
                    break;
                }
                case 2: {
                    ex2();
                    break;
                }
                case 3: {
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

    public static void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String name = sc.nextLine();
        char[] charArray = name.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        name = String.valueOf(charArray);
        System.out.println("Chuẩn hóa : " + name);
    }

    public static void ex2() {
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

        // Thay đổi

        for (int i = 0; i < numbersInput.length; i++) {
            if (numbersInput[i] % 2 == 0) {
                numbersInput[i] += 1;
            }
        }
        System.out.println("\nThay đổi = " + Arrays.toString(numbersInput));
    }

    public static void showMenu() {
        System.out.println("\n MENU ");
        System.out.println("1 - Bài 1");
        System.out.println("2 - Bài 2");
        System.out.println("3 - Thoát\n");
    }
}
