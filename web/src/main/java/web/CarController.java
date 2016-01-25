package web;

import entities.Car;
import entities.CarBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Bashar on 2016-01-24.
 */
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarBo carBo;

    @RequestMapping("/")
    public Iterable<Car> getAll() {
        return carBo.getAll();
    }
}
