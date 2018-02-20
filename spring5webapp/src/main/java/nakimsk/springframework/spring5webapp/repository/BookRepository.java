package nakimsk.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import nakimsk.springframework.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}