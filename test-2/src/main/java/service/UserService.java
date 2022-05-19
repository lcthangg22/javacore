package service;


import com.google.gson.Gson;

import com.google.gson.GsonBuilder;
import model.User;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

public class UserService {

    // Lấy list Object từ file json
    public List<User> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            List<User> students = Arrays.asList(gson.fromJson(reader, User[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // Ghi Object JSON file (Object là 1 đối tượng bất kỳ : Có thể là Single Object hoặc List Object)
    public void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            // Tạo đối tượng gson
            // Gson gson = new Gson();

            // Nếu muốn format JSON cho đẹp
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng Writer để ghi nội dung vào file
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            // Ghi object vào file
            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Scanner sc = new Scanner(System.in);

    List<User> users = new ArrayList<>();

    public User login() {
        System.out.println("Nhập email : ");
        String email = sc.nextLine();
        System.out.println("Nhập password : ");
        String password = sc.nextLine();
        User user = new User();
        int count = 0;
        users = getListObjectFromJsonFile("program.json");
        for (User u: users) {
            if (u.getEmail().equals(email) && u.getPassword().equals(password)){
                user = u;
                count++;
                break;
            }
        }
        if (count == 0) {
            throw new MyException("Tài khoản hoặc mật khẩu không chính xác!");
        }
        return user;
    }

    public void changeUsername(User u) {
        System.out.println("Nhập username mới : ");
        String newUsername = sc.nextLine();
        u.setUsername(newUsername);
        for (User user : users) {
            if (u.getEmail().equals(user.getEmail())) {
                user = u;
            }
        }
        convertObjectToJsonFile("program.json", users);
        System.out.println("Thay đổi username thành công! Username mới : " + newUsername);
    }

    public void changeEmail(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập email mới : ");
        User user1 = user;
        String newEmail = sc.nextLine();
        user.setEmail(newEmail);

        convertObjectToJsonFile("program.json", users);
        System.out.println("Thay đổi email thành công! Email mới : " + newEmail);
    }

    public void changePassword(User user) {
        System.out.print("Nhập mật khẩu mới : ");
        String newPassword = sc.nextLine();
        user.setPassword(newPassword);
        for (User u : users) {
            if (user.getEmail().equals(u.getEmail())) {
                u = user;
            }
        }
        convertObjectToJsonFile("program.json", users);
        System.out.println("Thay đổi mật khẩu thành công!");
    }

    public void register() throws IOException {
        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        List<User> newUser = new ArrayList<>();
        users = getListObjectFromJsonFile("program.json");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào email : ");
        String email = sc.nextLine();
        if (!Pattern.matches(EMAIL_PATTERN, email)) {
            throw new MyException("Email không đúng định dạng!");
        }
        int count = 0;
        for (User u : users) {
            if (u.getEmail().equals(email)) {
                count++;
            }
        }
        if (count > 0) {
            throw new MyException("Email đã tồn tại!");
        }
        System.out.print("Nhập vào password : ");
        String password = sc.nextLine();
        System.out.print("Nhập vào username : ");
        String username = sc.nextLine();
        User user = new User(email, password, username);
        newUser.add(user);
        newUser.addAll(users);
        convertObjectToJsonFile("program.json", newUser);
        System.out.println("Đăng ký thành công!");
    }

    public void forgotPassword() throws IOException {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Nhập email : ");
        String checkEmail = sc.nextLine();
        users = getListObjectFromJsonFile("program.json");
        int count = 0;
        for (User u : users) {
            if (u.getEmail().equals(checkEmail)) {
                user = u;
                count++;
            }
        }
        if (count == 0) {
            throw new MyException("Email không tồn tại!");
        } else {
            System.out.print("Nhập password mới : ");
            String newPassword = sc.nextLine();
            user.setPassword(newPassword);
            for (User u : users) {
                if (u.getEmail().equals(checkEmail)) {
                    u = user;
                }
            }
            convertObjectToJsonFile("program.json", users);
            System.out.println("Thay đổi mật khẩu thành công!");

        }

    }
}
