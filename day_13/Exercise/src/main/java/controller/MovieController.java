package controller;

import model.Movie;
import service.MovieService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieController {
    MovieService movieService = new MovieService();

    private void printMenu() {
        System.out.println("******** MENU ********");
        System.out.println("1. In thông tin các bộ phim ra màn hình");
        System.out.println("2. Sắp xếp phim theo tên");
        System.out.println("3. Sắp xếp phim theo thời lượng");
        System.out.println("4. Sắp xếp phim theo lượt xem");
        System.out.println("5. Đếm mỗi thể loại có bao nhiêu bộ phim");
        System.out.println("6. Thoát\n");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option;
        while (isContinue) {
            printMenu();
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Danh sách phim : ");
                    List<Movie> movies = movieService.getMovies();
                    movieService.printInfo(movies);
                    break;
                }
                case 2: {
                    System.out.println("Sắp xếp phim theo tên : ");
                    movieService.sortByTitle();
                    break;
                }
                case 3: {
                    System.out.println("Sắp xếp phim theo thời lượng : ");
                    movieService.sortByLenght();
                    break;
                }
                case 4: {
                    System.out.println("Sắp xếp phim theo lượt xem : ");
                    movieService.sortByView();
                    break;
                }
                case 5 : {
                    System.out.println("Đếm phim theo thể loại : ");
                    movieService.countMoiveByCategory();
                    break;
                }

                case 6 : {
                    isContinue = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không phù hợp!");
                    break;
                }
            }
        }
    }
}
