package practice.service;

import demo_abstract.Employee;
import practice.model.Student;

import java.net.PortUnreachableException;
import java.util.*;

public class StudentService implements IStudent {
    private ArrayList<Student> students;

    public StudentService() {
        init();
    }

    public void init() {
        students = new ArrayList<>();
        students.add(new Student(1,"A",18,"HN",10,"F"));
        students.add(new Student(2,"B",19,"TPHCM",9.5,"G"));
        students.add(new Student(3,"C",20,"HP",9,"H"));
        students.add(new Student(4,"D",21,"DN",8.5,"I"));
        students.add(new Student(5,"E",22,"CT",8,"J"));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }


    @Override
    public void printInfo(ArrayList<Student> list) {
        for (Student student: list) {
            System.out.println(student);
        }
    }

    @Override
    public Student creatStudent() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Nhập tên : ");
        String name = sc.nextLine();

        System.out.println("Nhập tuổi : ");
        int age = sc.nextInt();

        System.out.println("Nhập địa chỉ : ");
        String address = sc.nextLine();

        System.out.println("Nhập điểm : ");
//        double point = Integer.parseInt(sc.nextLine());
        double point = sc.nextDouble();
        sc.nextLine();

        System.out.println("Nhập lớp : ");
        String classroom = sc.nextLine();

        // Khởi tạo đối tượng
        Student student = new Student(rd.nextInt(100),name,age,address,point,classroom );

        // Thêm vào danh sách dể quản lý
        students.add(student);
        return student;
    }

    @Override
    public Student updatePoint(int id) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm : ");
        double point = Double.parseDouble(sc.nextLine());
        for (Student student1 :students) {
            if (student1.getId() == id){
                student = student1;
            }
        }
        student.setPoint(point);
        return student;
    }

    @Override
    public void deleteStudent(int id) {
        Iterator<Student> iterator =students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
            }
        }
    }

    @Override
    public ArrayList<Student> printInfoByClass(String classroom) {
        ArrayList<Student> list1 = new ArrayList<>();
        for (Student student: students) {
            if (student.getClassroom().equalsIgnoreCase(classroom)) {
                list1.add(student);
            }
        }
        return list1;
    }

    @Override
    public ArrayList<Student> sortByName(ArrayList<Student> students) {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return students;
    }

    @Override
    public ArrayList<Student> sortByAge(ArrayList<Student> students) {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        return students;
    }

    @Override
    public ArrayList<Student> sortByPoint(ArrayList<Student> students) {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.getPoint() - o1.getPoint());
            }
        });
        return students;
    }
}
