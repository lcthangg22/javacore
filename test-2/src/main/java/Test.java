import service.UserService;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            userService.register();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
