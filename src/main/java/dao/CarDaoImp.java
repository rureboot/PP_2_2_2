package dao;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    @Autowired
    private List<Car> cars;

    @Override
    public List<Car> getCarsList(int count) {

        List<Car> carList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            carList.add(cars.get(i));
        }

        return carList;
    }
}
