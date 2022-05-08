public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng
        Person person = new Person();

        // Gán giá trị cho đối tượng
        person.name = "Thắng";
        person.age = 24;
        person.address = "TN";

        // In ra thông tin
        System.out.println(person.name + " - " + person.age + " - " + person.address);
        System.out.println(person);

        // Gọi phương thức
        person.play();
        person.eat("Phở");
        System.out.println(person.getYearOfBirth());

        // Khởi tạo đối tượng 1 tham số
        Person person1 = new Person("Ng Văn A");
        person1.age = 32;
        person1.address = "SG";
        System.out.println(person1);

        // Khởi tạo đối tượng 2 tham số
        Person person2 = new Person("Tr Văn B",40);
        System.out.println(person2);

        // Khởi tạo đối tượng 2 tham số
        Person person3 = new Person("Ng Văn C",40, "HN");
        System.out.println(person3);
    }
}
