
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String phone = sc.nextLine();
        emailCheck(email);
        phoneCheck(phone);
    }

    public static void emailCheck (String email) {
        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
//        System.out.println(email + ": " + Pattern.matches(EMAIL_PATTERN, email));
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()){
            System.out.println("Email hợp lệ!");
        } else {
            System.out.println("Email không hợp lệ!");
        }
    }

    public static void phoneCheck(String phone) {
        String PHONE_PATTERN = "^0[983]{1}\\d{8,9}$";
//        System.out.println(phone + ": " + Pattern.matches(PHONE_PATTERN, phone));
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(phone);
        if (matcher.find()){
            System.out.println("Số điện thoại hợp lệ!");
        } else {
            System.out.println("Số điện thoại không hợp lệ!");
        }

    }
}





