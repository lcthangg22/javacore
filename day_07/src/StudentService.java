import java.util.Random;
import java.util.Scanner;

public class StudentService {
    public Student createStudent() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Student student = new Student();
        student.id = rd.nextInt(100);
        System.out.println("Nhập tên : ");
        student.name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết : ");
        student.theoryPoint = sc.nextDouble();
        System.out.println("Nhập điểm thực hành : ");
        student.practicePoint = sc.nextDouble();
        return student;
    }

    public double calculateAvgPoint(double theoryPoint, double practicePoint) {
        double avgPoint = (theoryPoint+practicePoint)/2;
        return avgPoint;
    }

    public void printInfo(Student s) {
        System.out.println("id: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Theory Point: " + s.theoryPoint);
        System.out.println("Practice Point: " + s.practicePoint);
        System.out.println("Diem trung binh: " + this.calculateAvgPoint(s.theoryPoint, s.practicePoint));
    }
}
