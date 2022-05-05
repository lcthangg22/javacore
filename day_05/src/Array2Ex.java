
import java.util.Scanner;

public class Array2Ex {
    public static void main(String[] args) {
        int[][] A = creatArray2();
//        System.out.println("Tổng các phần tử chẵn có trong mảng = " + sumEven(A));
//        System.out.println("Giá trị lớn nhất của mảng = " + findMax(A));
        System.out.println(maxRow(A));
    }

    public static int[][] creatArray2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng : ");
        int m = sc.nextInt();
        System.out.println("Nhập số cột : ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
        return A;
    }

    public static int sumEven (int[][] arr) {
        int sum = 0;
        for (int[] number: arr) {
            for (int total: number ) {
                if (total % 2  == 0) {
                    sum += total;
                }
            }
        }
        return sum;
    }

    public static int findMax (int[][] arr) {
        int max = arr[0][0];
        for (int[] number: arr) {
            for (int numberMax: number) {
                if (numberMax > max) {
                    max = numberMax;
                }
            }
        }
        return max;
    }

    public static int maxRow (int[][] arr) {
        int maxrow = arr[0][0];
        for (int[] number: arr) {
            for (int numberMax: number) {
                for (int i = 0; i < numberMax; i++) {
                    if (numberMax > maxrow) {
                        maxrow = numberMax;
                        break;
                    }
                }
            }
        }
        return maxrow;
    }

}
