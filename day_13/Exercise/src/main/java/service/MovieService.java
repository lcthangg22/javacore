package service;

import com.google.gson.Gson;
import model.Movie;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MovieService {
    // Lấy List object từ file json
    public List<Movie> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            List<Movie> movies = Arrays.asList(gson.fromJson(reader, Movie[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return movies;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    List<Movie> movies = new ArrayList<>();

    public MovieService() {
        movies = getListObjectFromJsonFile("movie.json");
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void printInfo(List<Movie> list) {
        for (Movie movie: list) {
            System.out.println(movie);
        }
    }

    public void sortByTitle() {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public void sortByLenght() {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getLenght() - o2.getLenght();
            }
        });
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public void sortByView() {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView() - o2.getView();
            }
        });
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public void countMoiveByCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thể loại phim : ");
        String category = sc.nextLine();
        int count = 0;
        for (Movie movie : movies) {
            for (String c : movie.getCategory()) {
                if (c.equals(category)) {
                    count++;
                }
            }

        }
        System.out.println("Thể loại " + category + " gồm " + count + " phim!");
        if (count == 0) {
            throw new NotFoundException("Không tìm thấy phim có thể loại là : " + category);
        }
    }
}
