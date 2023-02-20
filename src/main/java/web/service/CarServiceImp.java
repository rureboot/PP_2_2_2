package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private CarDao carDao;

    @Override
    public List<Car> getCarsList(int count) {
        if (count == 0 || count > 4) {
            return carDao.getCarsList(5);
        }
        return carDao.getCarsList(count);
    }

    @Autowired
    public CarServiceImp (CarDao carDao){
        this.carDao = carDao;
    }
}
