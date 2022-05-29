package student;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentService {
    List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "A", 1, Gender.MALE));
        students.add(new Student(2, "B", 2, Gender.FEMALE));
        students.add(new Student(3, "C", 3, Gender.MALE));
        students.add(new Student(4, "D", 4, Gender.FEMALE));
        students.add(new Student(5, "E", 5, Gender.MALE));
        students.add(new Student(6, "F", 6, Gender.FEMALE));
    }

    //    Viết method tính thứ hạng trung bình của cả lớp
    public int avgGrade() {
        int sumGrade = students.stream().reduce(0, (a, b) -> a + b.getGrade(),(integer, integer2) -> integer + integer2);
        return sumGrade / 6;
    }

    //    Viết method tính thứ hạng trung bình của nam trong lớp
    public int avgGradeOfMale() {
        int count = (int) students.stream().filter(gender -> gender.getGender() == Gender.MALE).count();
        int sum = students.stream()
                .filter(gender -> gender.getGender() == Gender.MALE)
                .reduce(0, (a, b) -> a + b.getGrade(), Integer::sum);
        return sum / count;
    }

    //    Viết method tính thứ hạng trung bình của Nữ trong lớp
    public int avgGradeOfFemale() {
        int count = (int) students.stream().filter(gender -> gender.getGender() == Gender.FEMALE).count();
        int sum = students.stream()
                .filter(gender -> gender.getGender() == Gender.FEMALE)
                .reduce(0, (a, b) -> a + b.getGrade(), Integer::sum);
        return sum / count;
    }

    //    Viết method tìm học viên Nam có thứ hạng cao nhất trong lớp
    public Student no1OfMale() {
        Student no1 = students.stream()
                .filter(gender -> gender.getGender() == Gender.MALE)
                .min(Comparator.comparing(Student::getGrade))
                .get();
        return no1;
    }

//    Viết method tìm học viên Nữ có thứ hạng cao nhất trong lớp
    public Student no1OfFemale() {
        Student no1 = students.stream()
                .filter(gender -> gender.getGender() == Gender.FEMALE)
                .min(Comparator.comparing(Student::getGrade))
                .get();
        return no1;
    }
//    Viết method tìm học viên Nam có thứ hạng thấp nhất trong lớp
//    Viết method tìm học viên Nữ có thứ hạng thấp nhất trong lớp
//    Viết method thứ hạng cao nhất của cả lớp
//    Viết method thứ hạng thấp nhất của cả lớp
//    Viết method lấy ra danh sách tất cả học viên Nữ trong lớp
//    Viết method sắp xếp tên học viên theo chiều tăng dần của bảng chữ cái
//    Viết method sắp xếp thứ hạng học viên theo chiều giảm dần
//    Viết method lấy ra học viên Nữ có tên bắt đầu bằng “J”
//    Viết method lấy ra top 5 người có thứ hạng cao nhất trong lớp
}
