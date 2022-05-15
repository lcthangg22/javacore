package practice.controller;

import practice.model.Student;
import practice.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    StudentService studentService = new StudentService();

    private void printMenu() {
        System.out.println("******** MENU ********");
        System.out.println("1. Xem danh sách học sinh");
        System.out.println("2. Thêm học sinh mới");
        System.out.println("3. Cập nhật điểm học sinh");
        System.out.println("4. Xóa học sinh");
        System.out.println("5. Xem danh sách học sinh theo lớp");
        System.out.println("6. Sắp xếp theo tên");
        System.out.println("7. Sắp xếp theo tuổi");
        System.out.println("8. Sắp xếp theo điểm");
        System.out.println("9. Thoát\n");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option;
        while (isContinue) {
            printMenu();
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Danh sách học sinh : ");
                    ArrayList<Student> students = studentService.getStudents();
                    studentService.printInfo(students);
                    break;
                }
                case 2: {
                    Student student = studentService.creatStudent();
                    System.out.println("Học sinh được thêm là : ");
                    System.out.println(student);
                    break;
                }
                case 3: {
                    System.out.println("Nhập vào id muốn cập nhật : ");
                    int id = Integer.parseInt(sc.nextLine());
                    Student student = studentService.updatePoint(id);
                    System.out.println(student);
                    break;
                }
                case 4: {
                    System.out.println("Nhập vào id muốn xóa : ");
                    int id = Integer.parseInt(sc.nextLine());
                    studentService.deleteStudent(id);
                    System.out.println("Xóa thành công! ");
                    break;
                }
                case 5 : {
                    System.out.println("Nhập tên lớp : ");
                    String classroom = sc.nextLine();
                    ArrayList<Student> students = studentService.printInfoByClass(classroom);
                    System.out.println("Danh sách sinh viên theo lớp " + classroom);
                    studentService.printInfo(students);
                    break;
                }
                case 6 : {
                    System.out.println("Sắp xếp theo tên : ");
                    studentService.printInfo(studentService.sortByName(studentService.getStudents()));
                    break;
                }
                case 7 : {
                    System.out.println("Sắp xếp theo tuổi : ");
                    studentService.printInfo(studentService.sortByAge(studentService.getStudents()));
                    break;
                }
                case 8 : {
                    System.out.println("Sắp xếp theo điểm : ");
                    studentService.printInfo(studentService.sortByPoint(studentService.getStudents()));
                    break;
                }
                case 9 : {
                    isContinue = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không phù hợp!");
                    break;
                }
            }
        }
    }
}
