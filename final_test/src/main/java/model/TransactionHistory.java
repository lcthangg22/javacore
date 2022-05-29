package model;

import lombok.*;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TransactionHistory {
    private int id;
    private int userId;
    private String content;
    private Date date;

    private String account;
    private int money;

    public void printTransactionHistory() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(id + " - " + formatter.format(date) + " - " + content + " - " + account + " - " + money);
    }
}
