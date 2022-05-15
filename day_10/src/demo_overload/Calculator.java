package demo_overload;

public class Calculator {

    // 2 tham số
    public int sum (int a,int b) {
        return a +b;
    }

    // 3 tham số
    public int sum(int a, int b, int c) {
        return a+b+c;
    }

    // Thay đổi kiểu dữ liệu
    public double sum(double a, double b) {
        return a+b;
    }

    // Lôi : Cùng tham số, kiểu dữ liệu, mà khác kiểu dữ liệu trả về
//    public double sum(int a,int b) {
//        return (double)
//    }
}
