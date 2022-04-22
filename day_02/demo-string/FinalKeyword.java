public class FinalKeyword {
    public final int age = 30;

    public static void main(String[] args) {
        // Vừa khai báo vừa khởi tạo giá trị
        final  String name = "anna";

        final String FIRST_NAME = "bob";

        // Khai báo trước khởi tạo giá trị sau
        final double PI;
        PI = 3.14;

        System.out.println(name);
        System.out.println(FIRST_NAME);
        System.out.println(PI);

        // Thay đổi giá trị của hằng số
        //  PI = 4; -> Không thể thực hiện gán lại giá trị

        // Tham chiếu đến biến global
        // System.out.println(age);

        FinalKeyword f = new FinalKeyword();
        System.out.println(f.age);
        System.out.println(sum(10,20));
    }

    public static final int sum(int a, int b) {
        return a + b;
    }
}
