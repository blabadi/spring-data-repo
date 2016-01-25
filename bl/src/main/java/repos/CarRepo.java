package repos;

import entities.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bashar on 2016-01-24.
 */
public interface CarRepo extends CrudRepository<Car, Long> {

}
