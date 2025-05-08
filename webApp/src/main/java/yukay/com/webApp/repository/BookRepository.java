package yukay.com.webApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yukay.com.webApp.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
