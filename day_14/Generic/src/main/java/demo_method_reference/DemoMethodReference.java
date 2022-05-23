package demo_method_reference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Hello {
    void display();
}

public class DemoMethodReference {
    public static void main(String[] args) {
        // Tạo 1 list student
        List<Student1> students = new ArrayList<>();
        students.add(new Student1(1,"A","a"));
        students.add(new Student1(2,"B","b"));
        students.add(new Student1(3,"C","c"));

        // In ra thông tin đối tượng
        students.forEach(Student1::printInfo);
        students.forEach(System.out::println);
        students.forEach(student1 -> System.out.println(students));

        // Sắp xếp theo tên

        students.sort((s1,s2) -> s1.getName().compareTo(s2.getName()));

        students.sort(Comparator.comparing(Student1::getName).reversed());
        students.forEach(System.out::println);

        // Triển khai functional interface dựa trên method reference
        Student1 student1 = new Student1(1,"D","d");
        Hello h  = student1::printInfo;
        h.display();

        Hello h1 = () -> System.out.println(student1.getId() + " - " + student1.getName() + " - " + student1.getEmail());
        h1.display();

    }
}
