import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int randomNumber = rd.nextInt();
        System.out.println("Số cần kiểm tra là : " + randomNumber);
            if (isPrimeNumber(randomNumber)) {
                System.out.print(randomNumber + " Là số nguyên tố!");
            }
                else {
                    System.out.println(randomNumber + " Không phải là số nguyên tố!");
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
