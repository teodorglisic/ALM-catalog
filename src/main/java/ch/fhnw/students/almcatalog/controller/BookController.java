package ch.fhnw.students.almcatalog.controller;

import ch.fhnw.students.almcatalog.entity.Book;
import ch.fhnw.students.almcatalog.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path = "/", produces = "application/json")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping(path="/search", produces = "application/json")
    public List<Book> getBooksByKeywords(@RequestParam("keyword") String keyword) {
        String[] keywords = keyword.split(",");
        return this.bookService.bookSearch(keywords);

    }
}
