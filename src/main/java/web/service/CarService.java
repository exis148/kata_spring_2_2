package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Component
public class CarService {

    CarDao carDao = new CarDao();

    public  List<Car> index(int count) {
        return carDao.index(count);
    }

    public  List<Car> showAll() {
        return carDao.showAll();
    }
}
