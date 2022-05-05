public class ex4 {
    public static void main(String[] args) {
        System.out.printf("%d số nguyên tố đầu tiên là: \n", 10);
        int dem = 0;
        int n = 2;
        while (dem < 10) {
            if (isPrimeNumber(n)) {
                System.out.print(n + " ");
                dem++;
            }
            n++;
        }
        System.out.printf("\nTất cả các số nguyên tố nhỏ hơn %d là: \n", 10);
        for (int i = 3; i < 10; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
