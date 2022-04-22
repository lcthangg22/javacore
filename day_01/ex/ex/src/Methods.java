public class Methods {

    public static void main(String[] args) {

//        1. Cho 2 số nguyên a và b
        int a = 10;
        int b = 3;
        int cong = a + b;
        System.out.println(a + " + " + b + " = " + cong);
        int tru1 = a - b;
        System.out.println(a + " - " + b + " = " + tru1);
        int tru2 = b - a;
        System.out.println(a + " - " + b + " = " + tru2);
        int nhan = a * b;
        System.out.println(a + " * " + b + " = " + nhan);
        float chia1 = (float) a / b;
        System.out.println(a + " / " + b + " = " + chia1);
        float chia2 = (float) b / a;
        System.out.println(a + " / " + b + " = " + chia2);
    }
}