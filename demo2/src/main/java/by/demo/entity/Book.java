package by.demo.entity;

import lombok.Data;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "BOOK_NAME", nullable = false)
    private String bookName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bookPublisher")
    @JoinColumn(name = "ID", nullable = false)
    private Set<Publisher> bookId;

    /*@ManyToOne
    @JoinColumn(name = "BOOK_PUBLISHER", nullable = false)
    private Publisher bookPublisher;*/

    @Column(name = "BOOK_AUTHOR", nullable = false)
    private String bookAuthor;

    @Column(name = "BOOK_PUBLISH", nullable = false)
    private int bookPublish;
}
