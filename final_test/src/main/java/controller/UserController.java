package controller;

import model.TransactionHistory;
import model.User;
import service.UserService;

import java.util.Scanner;

public class UserController {
    private UserService userService = new UserService();

    public void run() {
        Scanner sc = new Scanner(System.in);

        boolean isContinue = true;
        int option = 0;
        User user = userService.login();

        while (isContinue) {
            printMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 : {
                    userService.accountBalance(user);
                    break;
                }
                case 2 : {
                    TransactionHistory transactionHistory = new TransactionHistory();
                    transactionHistory = userService.transers(user);
                    System.out.println("Chuyển tiền thành công! ");
                    break;
                }
                case 3 : {
                    userService.transactionHistory(user);
                    break;
                }
                case  4 : {
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

    private void printMenu() {
        System.out.println("******** MENU ********");
        System.out.println("1. Truy vấn số dư tài khoản");
        System.out.println("2. Chuyển tiền");
        System.out.println("3. Xem lịch sử giao dịch");
        System.out.println("4. Thoát\n");
    }
}
