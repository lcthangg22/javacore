import exception.NotFoundException;
import model.Student;
import service.StudentService;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        // In ra thông tin học viên
        try {
            studentService.printStudent();
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Tìm kiếm học viên theo id
        try {
            Student student = studentService.getStudentById(1);
            System.out.println(student);

            Student student1 = studentService.getStudentById(10);
            System.out.println(student1);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Tìm kiếm học viên theo email
        try {
            Student student = studentService.getStudentByEmail("a@gmail.com");
            System.out.println(student);

            Student student1 = studentService.getStudentByEmail("d@gmail.com");
            System.out.println(student1);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Xóa student theo id
        try {
            // Xóa học viên có id hợp lệ
            studentService.deleteStudent(1);
            studentService.printStudent();

            studentService.deleteStudent(10);
            studentService.printStudent();
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
