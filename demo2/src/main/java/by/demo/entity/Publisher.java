package by.demo.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity

@Table(name = "PUBLISHER")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "bookPublisher")
    @JoinColumn(name = "BOOK_PUBLISHER", nullable = false)
    private Set<Book> bookId;*/

    @Column(name = "PUBLISHER")
    private String publisher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookPublisher() {
        return publisher;
    }

    public void setBookPublisher(String publisher) {
        this.publisher = publisher;
    }
}
