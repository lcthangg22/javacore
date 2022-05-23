package demo_lambda;

@FunctionalInterface
interface Caculator {
    int calcalte(int a, int b);
}

public class DemoCaculator {
    public static void main(String[] args) {
        // Cộng 2 số
        Caculator c = (a,b) -> a+b;
        System.out.println(c.calcalte(3,4));
        System.out.println(c.calcalte(10,20));

        // Trừ 2 số
        Caculator c1 = (a,b) -> a-b;
        System.out.println(c1.calcalte(3,4));
        System.out.println(c1.calcalte(10,20));

        // Nhân 2 số
        Caculator c2 = (a,b) -> a*b;
        System.out.println(c2.calcalte(3,4));
        System.out.println(c2.calcalte(10,20));

        // Chia 2 số
        Caculator c3 = (a,b) -> a / b;
        System.out.println(c3.calcalte(3,4));
        System.out.println(c3.calcalte(10,20));

    }
}
