package test.learnspring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import test.learnspring.spring5webapp.domain.Author;

// Set up data repository extends CRUDRepository<'your model class name', 'type of id field'>
public interface AuthorRepository extends CrudRepository<Author, Long> {


}
