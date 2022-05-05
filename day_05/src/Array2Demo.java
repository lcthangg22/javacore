public class Array2Demo {
    public static void main(String[] args) {
// Khai báo trước sau đó mới khởi tạo giá trị cho mảng
        int[][] numbers = new int[2][3];
        numbers[0][0] = 7;
        numbers[0][1] = 5;
        numbers[0][2] = 2;
        numbers[1][0] = 4;
        numbers[1][1] = 9;
        numbers[1][2] = 6;

// Vừa khai báo, vừa khởi tạo phần tử cho mảng
        int[][] numbersOther = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

// Để duyệt mảng đa chiều cần sử dụng 2 vòng lặp
// 1 vòng lặp duyệt hàng và 1 vòng lặp duyệt cột
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }

// Sử dụng forEach
        for (int[] numberRow: numbersOther) {
            for (int number: numberRow) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }
}
