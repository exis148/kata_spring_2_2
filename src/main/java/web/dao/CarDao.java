package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;


import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private List<Car> car;

    public CarDao() {
    }

    {
        car = new ArrayList<>();
        car.add(new Car(1, "BMW", "1982"));
        car.add(new Car(2, "Mercedes", "1999"));
        car.add(new Car(3, "buhanka", "1911"));
        car.add(new Car(4, "VAZ", "2107"));
        car.add(new Car(5, "Toyota", "2002"));

    }


    public List<Car> showAll() {
        return car;
    }

}
