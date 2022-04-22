public class PrintDemo {
    public static void main(String[] args) {
        System.out.println("My name is Thang");

        System.out.print("My name is Thang\n");
        System.out.print("I'm fine\n");

        System.out.printf("My name is %s. I'm %d years old. Point = %.2f", "Thang", 18, 9.123);

        // Bảng dữ liệu cơ bản
        // name - email - age
        System.out.printf("%20s %20s %10s\n", "Họ tên", "Email", "Tuổi");
        System.out.printf("%20s %20s %10d\n", "Luong Thang", "abc@gmail.com", 18);
        System.out.printf("%20s %20s %10d\n", "Họ tên", "def@gmail.com", 18);
    }
}
