import model.Book;
import service.BookService;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        List<Book> books = bookService.getListObjectFromJsonFile("book.json");
        bookService.printInfo(books);

//        List<Book> books1 = bookService.sortByPagenumber();
//        for (Book book: books1) {
//            System.out.println(book);
//        }


//        List<Book> books2 = bookService.findByName("Heaven's Burning");
//        for (Book book: books2) {
//            System.out.println(book);
//        }


//        List<Book> list = bookService.findByCategory("Drama");
//        for (Object book: list) {
//            System.out.println(book);
//        }
    }
}
