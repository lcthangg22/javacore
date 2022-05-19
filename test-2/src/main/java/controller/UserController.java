package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.User;
import service.UserService;


import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserController {

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

    UserService userService = new UserService();


    private void printMenu() {
        System.out.println("******** MENU ********");
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.println("3. Quên mật khẩu");
        System.out.println("4. Thoát\n");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option;
        while (isContinue) {
            printMenu();
            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    User user = userService.login();
                    System.out.println("Chào mừng " + user.getUsername() + ", bạn có thể thực hiện các công việc sau : ");
                    boolean isContinueSub = true;
                    int option1;
                    while (isContinueSub) {
                        System.out.println("1. Thay đổi username ");
                        System.out.println("2. Thay đổi email");
                        System.out.println("3. Thay đổi mật khẩu");
                        System.out.println("4. Đăng xuất");
                        System.out.println("5. Thoát chương trình\n");
                        System.out.print("Nhập lựa chọn: ");
                        option1 = Integer.parseInt(sc.nextLine());
                        switch (option1) {
                            case 1: {
                                userService.changeUsername(user);
                                break;
                            }
                            case 2: {
                                userService.changeEmail(user);
                                break;
                            }
                            case 3: {
                                userService.changePassword(user);
                                break;
                            }
                            case 4: {
                                boolean isContinueSub1 = false;
                                int option2;
                                while (isContinueSub1) {
                                    System.out.println("1. Đăng nhập");
                                    System.out.println("2. Đăng ký");
                                    System.out.println("3. Thoát\n");
                                    System.out.print("Nhập lựa chọn : ");
                                    option2 = Integer.parseInt(sc.nextLine());
                                    switch (option2) {
                                        case 1: {
                                            userService.login();
                                            break;
                                        }
                                        case 2: {
                                            try {
                                                userService.register();
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                            break;
                                        }
                                        case 3: {
                                            isContinueSub1 = false;
                                            break;
                                        }
                                        default: {
                                            System.out.println("Lựa chọn không phù hợp!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 5: {
                                isContinueSub = false;
                                break;
                            }
                            default: {
                                System.out.println("Lựa chọn không phù hợp!");
                                break;
                            }
                        }
                    }

                    break;
                }
                case 2: {
                    try {
                        userService.register();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }

                case 3: {
                    try {
                        userService.forgotPassword();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                }
                case 4: {
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

