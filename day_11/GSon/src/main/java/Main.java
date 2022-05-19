import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Student;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng
        Student student = new Student(1, "A", 18, "a@gmail.com");

        // In ra thông tin
        System.out.println(student);
        System.out.println(student.getName());

        // Thay đổi thông tin
        student.setEmail("aa@gmail.com");
        System.out.println(student);

        // Builder
        Student student1 = Student.builder()
                .id(2)
                .name("B")
                .email("b@gmail.com")
                .build();
        System.out.println(student1);

        // Chuyển Object sang JSON
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String studentJson = gson.toJson(student);
        System.out.println(studentJson);

        // Chuyển JSON sang Object
        String studentJson1 = """
            {
                "id": 3,
                "name": "C",
                "age": 22,
                "email": "c@gmail.com"
            }""";
        Student student2 = gson.fromJson(studentJson1, Student.class);
        System.out.println(student2);

        // Đọc file json và binding vào list object
        try {
            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get("list-student.json"));

            // Đọc thông tin từ file và binding và class
            List<Student> students = Arrays.asList(gson.fromJson(reader, Student[].class));

            // In ra thông tin student
            for (Student s: students) {
                System.out.println(s);
            }

            // Đóng file
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Ghi list object vào trong file
        List<Student> studentOther = new ArrayList<>();
        studentOther.add(student);
        studentOther.add(student1);
        studentOther.add(student2);

        try {
            // Tạo đối tượng Writer để ghi nội dung vào file
            Writer writer = Files.newBufferedWriter(Paths.get("students.json"));

            // Ghi vào file
            gson.toJson(studentOther,writer);

            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
