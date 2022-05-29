package student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

//    Viết method tính thứ hạng trung bình của cả lớp
        System.out.println(studentService.avgGrade());

//    Viết method tính thứ hạng trung bình của nam trong lớp
        System.out.println(studentService.avgGradeOfMale());

//    Viết method tính thứ hạng trung bình của Nữ trong lớp
        System.out.println(studentService.avgGradeOfFemale());

//    Viết method tìm học viên Nam có thứ hạng cao nhất trong lớp
        System.out.println(studentService.no1OfMale());

//    Viết method tìm học viên Nữ có thứ hạng cao nhất trong lớp
        System.out.println(studentService.no1OfFemale());

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
}
