import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        FilmService filmService = new FilmService();

        // Danh sách phim
        for (Film film : filmService.getFilms()) {
            System.out.println(film);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tiêu đề : ");
        String title = sc.nextLine();
        filmService.findByTitle(title);

    }
}
