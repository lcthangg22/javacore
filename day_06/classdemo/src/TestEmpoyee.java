import java.io.PrintStream;

public class TestEmpoyee {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // Gán giá trị cho đối tượng
        employee.name = "A";
        employee.age = 18;
        employee.address = "HN";
        employee.totalHours = 150;

        // In ra thông tin

        employee.printInfo();
    }
}
