package ch.fhnw.students.almcatalog;

import ch.fhnw.students.almcatalog.entity.Book;
import ch.fhnw.students.almcatalog.repository.BookRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlmCatalogApplication {

    private BookRepository bookRepository;

    public AlmCatalogApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AlmCatalogApplication.class, args);
    }

    @PostConstruct
    public void start() {
        Book b1 = new Book();
        b1.setISBN("978-1-4028-9462-6");
        b1.setTitle("The Clockwork Library");
        b1.setDescription("A steampunk adventure about a hidden library that controls the flow of time.");
        b1.setAuthor("A. Sinclair");
        bookRepository.save(b1);

        Book b2 = new Book();
        b2.setISBN("978-0-316-76948-3");
        b2.setTitle("Deep Learning Horizons");
        b2.setDescription("An introduction to deep learning and its real-world applications in AI.");
        b2.setAuthor("Andrew Ng");
        bookRepository.save(b2);

        Book b3 = new Book();
        b3.setISBN("978-1-4919-1889-0");
        b3.setTitle("Spring Boot Essentials");
        b3.setDescription("A practical guide to building RESTful APIs with Spring Boot and Java.");
        b3.setAuthor("Craig Walls");
        bookRepository.save(b3);

        Book b4 = new Book();
        b4.setISBN("978-0-13-235088-4");
        b4.setTitle("Clean Code");
        b4.setDescription("A handbook of agile software craftsmanship focusing on best practices.");
        b4.setAuthor("Robert C. Martin");
        bookRepository.save(b4);

        Book b5 = new Book();
        b5.setISBN("978-0-262-03384-8");
        b5.setTitle("Artificial Intelligence Foundations");
        b5.setDescription("A comprehensive overview of AI principles, from logic to learning.");
        b5.setAuthor("John McCarthy");
        bookRepository.save(b5);

        Book b6 = new Book();
        b6.setISBN("978-1-59327-928-8");
        b6.setTitle("Python for Everyone");
        b6.setDescription("Learn Python programming step by step with hands-on examples.");
        b6.setAuthor("Guido van Rossum");
        bookRepository.save(b6);

        Book b7 = new Book();
        b7.setISBN("978-1-59327-599-0");
        b7.setTitle("The Data Structure Handbook");
        b7.setDescription("An in-depth exploration of algorithms, data structures, and complexity.");
        b7.setAuthor("Donald Knuth");
        bookRepository.save(b7);

        Book b8 = new Book();
        b8.setISBN("978-1-118-94024-2");
        b8.setTitle("Java Concurrency in Practice");
        b8.setDescription("A definitive guide to building concurrent applications in Java.");
        b8.setAuthor("Brian Goetz");
        bookRepository.save(b8);

        Book b9 = new Book();
        b9.setISBN("978-0-07-352332-3");
        b9.setTitle("Database Systems Explained");
        b9.setDescription("A detailed introduction to relational databases, SQL, and data modeling.");
        b9.setAuthor("Jennifer Widom");
        bookRepository.save(b9);

        Book b10 = new Book();
        b10.setISBN("978-0-7432-7356-5");
        b10.setTitle("The Magic of Thinking Big");
        b10.setDescription("A motivational classic that inspires personal and professional success.");
        b10.setAuthor("David Schwartz");
        bookRepository.save(b10);

    }




}
