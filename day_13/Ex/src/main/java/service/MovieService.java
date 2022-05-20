package service;

import com.google.gson.Gson;
import model.Movie;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
