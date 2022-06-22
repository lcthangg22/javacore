import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    ConnectJDBC connectJDBC;
    public UserService() {
        connectJDBC = new ConnectJDBC();
    }

    public ArrayList<User> getAllUser() {
        ArrayList<User> list = new ArrayList<>();

        Connection connection = connectJDBC.getConnect();

        String query = "SELECT * FROM user";
        try {
            // Tạo đối tượng statement (Tạo câu truy vấn)
            Statement stm = connection.createStatement();

            // Thực thi câu truy vấn và trả về kết quả
            ResultSet resultSet = stm.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");

                list.add(new User(id,username,password,email));
            }

            // Đóng kết nối
            connection.close();
        } catch (SQLException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
        return list;
    }

    public void show(ArrayList<User> list) {
        list.forEach(System.out::println);
    }

    public User getUserById(int id) {
        User user = null;
        Connection connection = connectJDBC.getConnect();
        String query = "SELECT * FROM `user` WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");


                user = new User(id1,username,password,email);
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return user;
    }

    public void addNewUser(User newUser) {
        Connection connection = connectJDBC.getConnect();

        String query = "INSERT INTO `user`(`id`, `username`, `password`, `email`) VALUES (?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);

//            preparedStatement.setString(1,Util.randomId(1));
            preparedStatement.setInt(1, newUser.getId());
            preparedStatement.setString(2, newUser.getUsername());
            preparedStatement.setString(3, newUser.getPassword());
            preparedStatement.setString(4, newUser.getEmail());

            int row = preparedStatement.executeUpdate();
            System.out.println("Số dữ liệu được thêm: " + row);

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updatePassword(User user, String newPassword) {
        Connection connection = connectJDBC.getConnect();
        String query = "UPDATE `user` SET `password`= ? WHERE id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,newPassword);
            preparedStatement.setInt(2,10);

            int row = preparedStatement.executeUpdate();
            System.out.println("Số dữ liệu được thay đổi: " + row);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteUser(int id) {
        Connection connection = connectJDBC.getConnect();
        String query = "DELETE FROM `user` WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int row = preparedStatement.executeUpdate();
            System.out.println("Số dữ liệu đã xóa: " + row);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email : ");
        String email = sc.nextLine();
        System.out.println("Nhập password : ");
        String password = sc.nextLine();
        User user = new User();
        Connection connection = connectJDBC.getConnect();
        String query = "SELECT * FROM user";
        try {
            Statement stm = connection.createStatement();

            ResultSet resultSet = stm.executeQuery(query);
            if (resultSet.next()) {
                if (resultSet.getString("email").equals(email) && resultSet.getString("password").equals(password)
                ) {
                    System.out.println("Đăng nhập thành công!");
                    int id = resultSet.getInt("id");
                    String username = resultSet.getString("username");
                    String password1 = resultSet.getString("password");
                    String email1 = resultSet.getString("email");

                    user = new User(id,username,password1,email1);
                } else {
                    System.out.println("Đăng nhập không thành công");
                }
            }
            // Đóng kết nối
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;

    }
}
