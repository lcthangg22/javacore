import java.time.LocalDate;

public class Person {
    // Khai báo thuộc tính
    public String name;
    public int age;
    public String address;

    // Khởi tạo constructor mặc định
    public Person() {
        System.out.println("Constructor mặc định được gọi");
    }

    // Khởi tạo Constructor 1 tham số
    public Person(String name) {
        System.out.println("Constructor 1 tham số được gọi");
        this.name = name;
    }

    // Khởi tạo Constructor 2 tham số
    public Person(String name, int age) {
        System.out.println("Constructor 2 tham số được gọi");
        this.name = name;
        this.age = age;
    }

    // Khởi tạo Constructor full tham số
    public Person(String name, int age, String address) {
        System.out.println("Constructor full tham số được gọi");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Khai báo phương thức
    public void play() {
        System.out.println("Đang chơi game ...");
    }

    public void eat(String foodname) {
        System.out.println("Đang ăn " + foodname);
    }

    public int getYearOfBirth() {
        return LocalDate.now().getYear() - age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

