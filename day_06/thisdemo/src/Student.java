public class Student {
    public String name;
    public int age;
    public String gender;

    public static String school = "Lê Quý Đôn";

    // Khởi tạo constructor mặc định
    public Student() {
        System.out.println("Constructor mặc định được gọi");
    }

    // Khởi tạo Constructor 1 tham số
    public Student(String name) {
        System.out.println("Constructor 1 tham số được gọi");
        this.name = name;
    }

    // Khởi tạo Constructor 2 tham số
    public Student(String name, int age) {
        this(name);
        System.out.println("Constructor 2 tham số được gọi");
//        this.name = name;
        this.age = age;
    }

    // Khởi tạo Constructor full tham số
    public Student(String name, int age, String gender) {
        this(name, age);
        System.out.println("Constructor full tham số được gọi");
//        this.name = name;
//        this.age = age;
        this.gender = gender;

    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Đây là hàm main của Student");
    }

    static {
        System.out.println("Đây là khối static");
    }
}
