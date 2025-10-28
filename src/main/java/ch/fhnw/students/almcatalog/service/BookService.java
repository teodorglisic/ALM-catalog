package ch.fhnw.students.almcatalog.service;

import ch.fhnw.students.almcatalog.entity.Book;
import ch.fhnw.students.almcatalog.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }




    public List<Book> bookSearch(String[] keywords) {
        List<Book> queryResult = new ArrayList<>();
        for (Book b : this.bookRepository.findAll()) {
            if (keywords.length > 1) {
                boolean[] resultsCheck = new boolean[keywords.length];
                for (int i = 0; i < keywords.length; i++) {
                    boolean result = b.getISBN().toUpperCase().contains(keywords[i]) || b.getAuthor().toUpperCase().contains(keywords[i].toUpperCase())
                            || b.getTitle().toUpperCase().contains(keywords[i].toUpperCase())
                            || b.getDescription().toUpperCase().contains(keywords[i].toUpperCase());
                    resultsCheck[i] = result;
                }

                boolean allTrue = true;
                for (boolean result: resultsCheck) {
                    if (!result) {
                        allTrue = false;
                        break;
                    }
                }

                if (allTrue) {
                    queryResult.add(b);
                }

            } else {
                if (b.getISBN().toUpperCase().contains(keywords[0]) || b.getAuthor().toUpperCase().contains(keywords[0].toUpperCase())
                        || b.getTitle().toUpperCase().contains(keywords[0].toUpperCase())
                        || b.getDescription().toUpperCase().contains(keywords[0].toUpperCase())) {
                    queryResult.add(b);
                }
            }
        }

        return queryResult;
    }


    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }
}
