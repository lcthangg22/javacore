import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int[][] A = creatArray2();
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
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.println("Các phần tử nằm trên đường chéo chính : " + A[i][j]);
                }
            }
        }

        int[][] B = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        //Hiển thị ma trận tổng
        System.out.println("\nMa trận tổng của hai ma trận đã cho là: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }

        return A;
    }

}
