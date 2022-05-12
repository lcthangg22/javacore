

public class TestStudent {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = studentService.createStudent();
        System.out.println("Thong tin hoc vien la: ");
        studentService.printInfo(student);
    }
}
