public class IfDemo {
    public static void main(String[] args) {
//        int hour = 16;
//        if (hour < 10) {
//            System.out.println("Good morning!");
//        }
//
//        // If else
//        if (hour < 12) {
//            System.out.println("Good morning!");
//        } else {
//            System.out.println("Good afternoon!");
//        }
//
//        // Câu lệnh if /else if /else
//        if (hour < 12) {
//            System.out.println("Good morning!");
//        } else if (hour >= 12 && hour <= 18) {
//            System.out.println("Good afternoon!");
//        } else {
//            System.out.println("Good evening!");
//        }
//
//        String message = hour < 12 ? "Good morning!" : "Good afternoon!";
//        System.out.println("message = " + message);

        // Câu lệnh if /else if /else lồng nhau
        int number = 11;
        if (number > 0) {
//            System.out.println("Số dương");
            if (number % 2 == 0) {
                System.out.println("Số dương chẵn");
            } else {
                System.out.println("Số dương lẻ");
            }
        } else if (number < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Số không");
        }
    }
}
