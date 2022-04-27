import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        System.out.println(repeatString("a"));
//        System.out.println(rpString("a"));
//        System.out.println(repeatStringWithDash("a"));
//        System.out.println(repeatStringWithCount("a",5));
//        System.out.println(sum());
//        System.out.println(getVolume(3));
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option = 0;
        while (isContinue) {
            showMenu();
            System.out.println("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 : {
                    System.out.println("Nhập vào chuỗi");
                    String str = sc.nextLine();

                    System.out.println(rpString(str));
                    break;
                }
                case 2 : {
                    System.out.println("Nhập vào chuỗi");
                    String str = sc.nextLine();

                    System.out.println(repeatStringWithDash(str));
                    break;
                }
                case 3 : {
                    isContinue = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("1 - Bài 1");
        System.out.println("2 - Bài 2");
        System.out.println("3 - Thoát chương trình");
    }

    //    public static String repeatString(String name) {
//        return name.repeat(10);
//    }
//    Bài 1. Viết method truyền vào 1 chuỗi bất kỳ, hãy sao chép chuỗi đó lên 10 lần.
//
//    Ví dụ : repeatString(“a”) => Kết quả trả về là “aaaaaaaaaa”
    public static String rpString(String str) {
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += str;
        }
        return result;
    }

    //    Bài 2. Viết method truyền vào 1 chuỗi bất kỳ, hãy viết hàm có tác dụng sao chép đó chuỗi lên 10 lần,
    //    ngăn cách nhau bởi dấu gạch ngang.
//
//    Ví dụ: repeatString(“a”) => Kết quả trả về là “a-a-a-a-a-a-a-a-a-a”
    public static String repeatStringWithDash(String str) {
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += str + "-";
        }
        return result.substring(0, result.length() - 1);
    }
    //    Bài 3. Viết method truyền vào 1 chuỗi bất kỳ và 1 số nguyên dương n > 1,
    //    hãy viết hàm có tác dụng sao chép đó chuỗi lên n lần, ngăn cách nhau bởi dấu gạch ngang.
//
//    Ví dụ: repeatString(“a”, 5) => Kết quả trả về là ‘a-a-a-a-a’
//    public static String repeatStringWithCount(String str,int count) {
//        String result = "";
//        for (int i = 0; i < count; i++) {
//            result += str + "-";
//        }
//        return result.substring(0, result.length() - 1);
//    }

//    Bài 4. Viết method tính tổng các số chia hết cho 5 từ 0 -> 100
    public static int sum() {
        int total = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                total += i;
            }
        }
        return total;
    }
//    Bài 5: Viết method tính thể tích hình cầu, với tham số truyền vào là bán kính của hình cầu.
    public static double getVolume(double radius) {
        return 4/3 * Math.PI * Math.pow(radius,3);
    }
//    Bài 6: Viết method để in ra các số từ 1 đến 100.
//
//    Trong đó
//
//    Những số nào chia hết cho 3 thì in chữ “Fizz”
//    Những số chia hết cho 5 thì in chữ “Buzz”,
//    Còn những số chia hết cho cả 3 và 5 thì in chữ “FizzBuzz”
    public static void printFizzBuzz() {
        for (int i = 1; i <= 100; i++) {

        }
    }
}
