enum Role {
    ADMIN, USER, SALE, TEACHER
}

public class EnumDemo {
    // Khai báo  enum trong nội bộ class
    enum Gender {
        MALE, FEMALE
    }
     enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
     }
    public static void main(String[] args) {
        System.out.println(Gender.MALE);
        System.out.println(" Giới tính của tôi là: " + Gender.FEMALE);
        System.out.println(" Tôi đang là " + Role.ADMIN + " của một trang web ");
        System.out.println(Season.SUMMER);
    }
}
