public class Methods {

    public static void main(String[] args) {

//        1. Cho 2 số nguyên a và b
        int a = 20;
        int b = 20;
        int cong = a + b;
        System.out.println(a + " + " + b + " = " + cong);
        int tru1 = a - b;
        System.out.println(a + " - " + b + " = " + tru1);
        int tru2 = b - a;
        System.out.println(a + " - " + b + " = " + tru2);
        int nhan = a * b;
        System.out.println(a + " * " + b + " = " + nhan);
        int chia1 = a / b;
        System.out.println(a + " / " + b + " = " + chia1);
        int chia2 = b / a;
        System.out.println(a + " / " + b + " = " + chia2);

//        2. Tính chỉ số BMI
        float weight = 60f;
        double height = 1.70;
        double BMI = weight / Math.pow( height, 2) ;
        System.out.println("Cân nặng = " + weight);
        System.out.println("Chiều cao = " + height);
        System.out.println(Math.round(BMI));
    }
}