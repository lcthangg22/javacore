import java.util.Random;
import java.util.Scanner;

public class StudentService {
    public Student createStudent() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int id = rd.nextInt(100);
        System.out.println("Nhập tên : ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết : ");
        Double theoryPoint = sc.nextDouble();
        System.out.println("Nhập điểm thực hành : ");
        Double practicePoint = sc.nextDouble();
        return createStudent();
    }

    public double calculateAvgPoint() {
        double avgPoint = (createStudent().theoryPoint + createStudent().practicePoint) / 2;
        return avgPoint;
    }

    public void printInfo(Student s) {

    }
}
