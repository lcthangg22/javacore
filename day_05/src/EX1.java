import java.util.Arrays;

public class EX1 {
    public static void main(String[] args) {
        // numberOther-argument
        int[] numberOther = {1, 2, 3, 4, 5};
        int[] data = modulo2(numberOther);
        System.out.println(Arrays.toString(data));
    }

    public  static int[] modulo2 (int[] number) { // number-parameter: đầu vào ; int[]-returnvalue: đầu ra
        int[] newArr = new int[number.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = number[i] % 2;
        }
        return newArr;
    }
}
