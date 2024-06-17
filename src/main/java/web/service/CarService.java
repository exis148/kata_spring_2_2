package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    @Autowired
    CarDao carDao;

    private List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(1, "BMW", "1982"));
        car.add(new Car(2, "Mercedes", "1999"));
        car.add(new Car(3, "buhanka", "1911"));
        car.add(new Car(4, "VAZ", "2107"));
        car.add(new Car(5, "Toyota", "2002"));

    }

    public List<Car> index(int count) {

        if(count<0){
            return car;
        }

        if (count <= car.toArray().length) {
            List<Car> result = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                result.add(car.get(i));
            }

            return result;
        }
        return car;
    }
    public List<Car> showAll() {
        return carDao.showAll();
    }
    }



