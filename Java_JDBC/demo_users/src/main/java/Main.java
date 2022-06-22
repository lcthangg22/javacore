import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
//        ArrayList<User> list = userService.getAllUser();
//        userService.show(list);
//
        User u = userService.getUserById(1);
//        System.out.println(u);

//        User newUser = new User(Util.randomNumber(1,10),"thang2","thang2@gmail,com","1234567");
//
//        userService.addNewUser(newUser);

//        userService.updatePassword(u,"123456");
//        userService.deleteUser(7);
        User user = userService.login();
        System.out.println("Xin chào " + user.getUsername() );

//        ConnectJDBC connectJDBC = new ConnectJDBC();
//        Connection connection = connectJDBC.getConnect();
//
//        String query = "SELECT * FROM user";
//        try {
//            // Tạo đối tượng statement (Tạo câu truy vấn)
//            Statement stm = connection.createStatement();
//
//            // Thực thi câu truy vấn và trả về kết quả
//            ResultSet resultSet = stm.executeQuery(query);
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String username = resultSet.getString("username");
//                String password = resultSet.getString("password");
//                String email = resultSet.getString("email");
//
//                System.out.println(id + " - " + username + " - " + password + " - " + email);
//            }
//
//            // Đóng kết nối
//            connection.close();
//        } catch (SQLException e) {
////            throw new RuntimeException(e);
//            e.printStackTrace();
//        }
    }
}
