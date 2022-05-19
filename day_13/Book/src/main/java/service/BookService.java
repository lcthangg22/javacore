package service;

import com.google.gson.Gson;
import model.Book;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BookService {
    // Lấy list Object từ file json
    public List<Book> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            List<Book> students = Arrays.asList(gson.fromJson(reader, Book[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public BookService() {
        init();
    }

    public void init() {
        books = getListObjectFromJsonFile("book.json");
    }

    List<Book> books = new ArrayList<>();

    public void printInfo(List<Book> list) {
        for (Book book : list) {
            System.out.println(book);
        }
    }

    public List<Book> findByName(String name) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(name.toLowerCase(Locale.ROOT))) {
                list.add(book);
            }
        }
        return list;
    }

    public List<Book> findByCategory(String name) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            for (String c: book.getCategory()) {
                if(c.equals(name)) {
                    list.add(book);
                }
            }

        }
        return list;
    }

    public List<Book> sortByPagenumber() {
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage_number() - o2.getPage_number();
            }
        });
        return books;
    }

    public List<Book> sortByReleaseyear() {
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getRelease_year() - o2.getRelease_year();
            }
        });
        return books;
    }
}
