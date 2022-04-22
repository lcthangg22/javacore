public class Methodss {
    public static void main(String[] args) {
        //        2. Tính chỉ số BMI
        float weight = 60f;
        double height = 1.70;
        double BMI = weight / Math.pow( height, 2) ;
        System.out.println("Cân nặng = " + weight);
        System.out.println("Chiều cao = " + height);
        System.out.println(Math.round(BMI));
    }
}
