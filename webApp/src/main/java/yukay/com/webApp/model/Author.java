package yukay.com.webApp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table
@Data

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorId;
    private String name;
    private int age;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Book> book;
}
