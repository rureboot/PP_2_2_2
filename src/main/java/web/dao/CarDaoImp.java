package web.dao;

import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private final List<Car>  cars;

    @Override
    public List<Car> getCarsList(int count) {

        List<Car> carList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            carList.add(cars.get(i));
        }

        return carList;
    }

    @Autowired
    public CarDaoImp(List<Car> cars){
        this.cars = cars;
    }
}
