public class Test {
    public static void main(String[] args) {
        Student student = new Student("Ng Văn A",20, "Male");
        System.out.println(student);

        System.out.println(Student.school);
        Student.sayHello();
    }
}
