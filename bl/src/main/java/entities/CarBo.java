package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.CarRepo;


/**
 * Created by Bashar on 2016-01-24.
 */
@Service
public class CarBo {

    @Autowired
    CarRepo carRepo;

    public Iterable<Car> getAll(){
        return carRepo.findAll();
    }

}
