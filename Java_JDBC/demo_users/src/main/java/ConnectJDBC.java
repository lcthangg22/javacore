import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class ConnectJDBC {

    private String hostName = "localhost:8080";
    private String dbName = "users_test";
    private String username = "root";
    private String password = "123";

    private String url = "jdbc:mysql://"+hostName+"/"+dbName;
    public Connection getConnect() {
        Connection con = null;

        try {
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
//            throw new RuntimeException(e);
//            e.printStackTrace();
            System.out.println("Kết nối không thành công!");
        }

        return con;
    }
}
