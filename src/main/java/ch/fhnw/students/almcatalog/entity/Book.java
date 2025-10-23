package ch.fhnw.students.almcatalog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    private String ISBN;
    private String Title;
    private String Description;
    private String Author;

}
