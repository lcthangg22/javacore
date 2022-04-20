public class Main {
//    Khai báo biến global
    public static int globalVariable = 20;

    public static void main(String[] args) {
//        Chương trình đầu tiên
        System.out.println("Hello World");

//        Khai báo biến
        String firstName, lastName;

//        Khởi tạo giá trị cho biến
        firstName = "Luong";
        lastName = "Thang";

//        In ra biến
        System.out.println(firstName);
        System.out.println(lastName);

//        Vừa khai báo vừa khởi tạo giá trị cho biến
//        String fullName = "Luong Thang";
        String fullName = firstName + " " + lastName; // Cộng chuỗi
        System.out.println(fullName);

        int age = 24; // Kiểu int
        System.out.println("Xin chào các bạn, tôi tên là" + fullName + ". Mình sinh năm " + (2022 - 24) + " và năm nay mình " + age + " tuổi." );

        // Kiểu long
        long money = 2_000_000_000L;
        System.out.println("Tài khoản không có gì ngoài tiền, chỉ có " + money + " tỷ thôi!!!");

        // Kiểu boolean (đúng sai) true/false
        boolean isMarried= false;
        System.out.println("isMarried = " + isMarried + " là chưa lấy vợ nhé.");
        System.out.println("isMarried = " + !isMarried + " là dã lấy vợ nhé."); // Phủ định

        // Khai báo dấu phẩy động
        float weight = 60f;
        double height = 1.70;

        System.out.println("Cân nặng = " + weight);
        System.out.println("Chiều cao = " + height);

        // Kiểu ký tự: char --> search ASCII trên google;
        char charA = 'A';
        char chara = 98;

        System.out.println(charA);
        System.out.println(chara);

        // Ép kiểu
        int number = 10;
        long  number1 =  number;
        double number2 = number;

        // Ép kiểu ngầm định : Từ giá trị nhỏ > lớn  (trình biên dịch tự biết và thực hiện)
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);

        //  Ép kiểu  tường minh : Từ giá trị lớn > nhỏ (tự làm)
        double heightValue = 1.8;
        int heightValueConvert = (int) heightValue;
        System.out.println(heightValueConvert);

        // Phạm vi của biến
        {
            int localVariable = 10;
            System.out.println(localVariable);
        }
//        Lỗi : Ngoài phạm vi sử dụng biến
//        System.out.println(localVariable);
        System.out.println(globalVariable);
    }
}
