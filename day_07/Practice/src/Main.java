import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        MovieService movieService = new MovieService();
        SerialService serialService = new SerialService();

        // Danh sách phim

        for (Movie movie: movieService.getMoives()) {
            System.out.println(movie);
        }

        for (Serial serial: serialService.getSerials()) {
            System.out.println(serial);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tiêu đề : ");
        String title = sc.nextLine();
        movieService.findByTitle(title);
        serialService.findByTitle(title);


    }
}
