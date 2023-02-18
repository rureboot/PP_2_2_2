package service;

import dao.CarDao;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IServiceImp implements IService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCarsList(int count) {
        if (count == 0 || count > 4) {
            return carDao.getCarsList(5);
        }
        return carDao.getCarsList(count);
    }
}
