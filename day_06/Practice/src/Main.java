import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        BookService bookService = new BookService();

        // Danh sách book
        for (Book book : bookService.getBooks()) {
            System.out.println(book);
        }

        // Tìm kiếm theo tên
//        bookService.findByTitle("khốn khổ");

//         Menu terminal
        Scanner sc = new Scanner(System.in);

        int option;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("Nhập tên : ");
                    String title = sc.nextLine();
                    bookService.findByTitle(title);
                    break;
                }
                case 2: {
                    System.out.println("Nhập từ khóa : ");
                    String category = sc.nextLine();
                    bookService.findByCategory(category);
                    break;
                }
                case 3: {
                    System.out.println("Nhập năm xuất bản : ");
                    int year = sc.nextInt();
                    bookService.findByPublishingOfThisYear(year);
                    break;
                }
                case 4: {
                    isQuit = true;
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
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Tìm theo tên");
        System.out.println("2 - Tìm theo từ khóa");
        System.out.println("3 - Tìm theo năm xuất bản");
        System.out.println("4 - Thoát\n");
    }
}


