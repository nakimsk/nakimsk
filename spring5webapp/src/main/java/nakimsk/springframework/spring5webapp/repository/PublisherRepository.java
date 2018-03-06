/**
 * 
 */
package nakimsk.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import nakimsk.springframework.spring5webapp.model.Publisher;

/**
 * @author admin
 *
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long>  {

}
