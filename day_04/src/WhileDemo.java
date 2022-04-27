import java.util.Random;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 10) {
            System.out.println(i++);
//            i++;
        }

        Random rd = new Random();

        while (true) {
            int rdNumber = rd.nextInt(100);

            if (rdNumber > 90) {
                break;
            }
            System.out.print(rdNumber + "\t");
        }
    }
}
