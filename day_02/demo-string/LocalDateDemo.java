import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

    public static void main(String[] args) {

        // Lấy ngày hiện tại
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        //  Chỉ định ngày tháng năm
        LocalDate ld1 = LocalDate.of(2022,9,21);
        System.out.println(ld1);

        // Lấy ra năm hiện tại
        System.out.println("Nam hien tai : " + ld.getYear());
        System.out.println("Thang hien tai : " + ld.getMonth().getValue()); // getValue: lấy ra số

        // Thay đổi thời gian
        System.out.println(ld.plusYears(2));
        System.out.println(ld.minusMonths(2));

        System.out.println(ld.getYear() + " có là năm nhuận không : " + ld.isLeapYear());
        System.out.println(ld.plusYears(2).getYear() + " có là năm nhuận không : " + ld.plusYears(2).isLeapYear());

        // So sánh
        System.out.println(ld.equals(ld1));
        System.out.println(ld.isBefore(ld1));
        System.out.println(ld.isAfter(ld1));

        // Format định dạng
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String strDate = ld.format(formatter); // Áp dụng format cho đối tượng ld
        System.out.println(strDate);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        String strDate1 = ld.format(formatter1); // Áp dụng format cho đối tượng ld
        System.out.println(strDate1);
    }

}
