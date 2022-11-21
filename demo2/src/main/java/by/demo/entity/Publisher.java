package by.demo.entity;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "PUBLISHER")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "bookPublisher")
    @JoinColumn(name = "BOOK_PUBLISHER", nullable = false)
    private Set<Book> bookId;*/

    @Column(name = "PUBLISHER")
    private String bookPublisher;

}
