package test.learnspring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import test.learnspring.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {


}
