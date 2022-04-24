public class Ex4 {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int tong = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                tong += i;
            }
        }
        System.out.println("Tổng các số chia hết cho 5 từ 0 -> 100 là " + tong);
    }
}
