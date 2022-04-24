public class SwitchCaseDemo {
    public static void main(String[] args) {
        // Tiền đang có
        int money = 10000;

        // Menu
        switch (money) {
            case 12000
                :
            {
                System.out.println("Cafe sữa");
                break;
            }
            case 10000
                :
            {
                System.out.println("Trà đá");
                break;
            }
            case 8000
                :
            {
                System.out.println("Cafe đá");
                break;
            }
            case 2000
                :
            {
                System.out.println("Sting dâu");
                break;
            }
            default: {
                System.out.println("Không có đồ uống nào phù hợp");
            }
        }
    }
}
