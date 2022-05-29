package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exception.MoneyException;
import exception.NotFoundException;
import model.TransactionHistory;
import model.User;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class UserService {
    // Lấy list Object từ file json
    public List<User> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            List<User> users = Arrays.asList(gson.fromJson(reader, User[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<TransactionHistory> getListObjectFromJsonFile1(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            List<TransactionHistory> transactionHistories = Arrays.asList(gson.fromJson(reader, TransactionHistory[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return transactionHistories;
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

    public UserService() {
        users = getListObjectFromJsonFile("user.json");
        transactionHistories = getListObjectFromJsonFile1("transaction-history.json");
    }

    List<User> users = new ArrayList<>();
    List<TransactionHistory> transactionHistories = new ArrayList<>();

    public User login() {
        System.out.println("Nhập số điện thoại : ");
        String phone = sc.nextLine();
        System.out.println("Nhập mật khẩu : ");
        String password = sc.nextLine();
        User user = users.stream()
                .filter(u -> u.getPhone().equals(phone) && u.getPassword().equals(password))
                .findAny()
                .orElse(null);
        if (user == null) {
            throw new NotFoundException("Số điện thoại hoặc mật khẩu không chính xác!");
        }
        return user;
    }

    public void accountBalance(User user) {
        System.out.println("Số dư hiện tại của bạn là : " + user.getBalance());
    }

    public TransactionHistory transactionHistory(User user) {
        transactionHistories = transactionHistories
                .stream()
                .filter(transaction -> transaction.getUserId() == user.getId())
                .collect(Collectors.toList());
        transactionHistories
                .stream()
                .forEach(transactionHistory -> transactionHistory.printTransactionHistory());
        return null;
    }

    public TransactionHistory transers(User user) {
        Random rd = new Random();
        System.out.println("Nhập số tài khoản thụ hưởng : ");
        String account = sc.nextLine();
        System.out.println("Nhập số tiền bạn muốn chuyển : ");
        int money = Integer.parseInt((sc.nextLine()));
        List<TransactionHistory> histories = new ArrayList<>();
        User user1 = users
                .stream()
                .filter(u -> u.getAccount().equals(account))
                .findAny()
                .orElse(null);
        if (user1 == null) {
            throw new NotFoundException("Tài khoản không tồn tại! ");
        }

        if (user.getBalance() <= 50000) {
            throw new MoneyException("Số dư nhỏ hơn 50000!");
        }
        if (user.getBalance() < money) {
            throw new MoneyException("Số dư nhỏ hơn số tiền chuyển!");
        }
        if (user.getBalance() - money < 50000) {
            throw new MoneyException("Số dư còn lại phải bằng 50000!");
        }
        System.out.print("Nhập mô tả : ");
        String content = sc.nextLine();
        Date date = new Date();
        TransactionHistory newHistory = new TransactionHistory(rd.nextInt(100), user.getId(), content, date, account, money);
        histories.add(newHistory);
        histories.addAll(transactionHistories);
        user.setBalance(user.getBalance() - money);
        user1.setBalance(user1.getBalance() + money);
        for (User u : users) {
            if (u.getId() == user.getId()) {
                u = user;
            }
        }
        for (User u : users) {
            if (u.getId() == user1.getId()) {
                u = user1;
            }
        }
        convertObjectToJsonFile("user.json", users);
        convertObjectToJsonFile("transaction-history.json", histories);
        return newHistory;
    }
}
