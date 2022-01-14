package test.learnspring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import test.learnspring.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
