package ch.fhnw.students.almcatalog.repository;

import ch.fhnw.students.almcatalog.entity.Book;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, String> {
    boolean existsBookByAuthor(String author);
    boolean existsBookByTitle(String title);
    boolean existsBookByDescription(String description);




}
