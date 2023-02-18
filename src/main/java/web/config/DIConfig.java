package web.config;

import dao.CarDao;
import dao.CarDaoImp;
import model.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.IService;
import service.IServiceImp;

import java.util.LinkedList;
import java.util.List;

@Configuration

public class DIConfig {

    @Bean
    List<Car> cars() {
        List<Car> cars = new LinkedList<>();
        cars.add(new Car("Volkswagen", "Golf", 15000));
        cars.add(new Car("Volkswagen", "Jeta", 10000));
        cars.add(new Car("Lada", "Kalina", 7000));
        cars.add(new Car("Infinity", "trash", 77000));
        cars.add(new Car("BelAZ", "210", 175000));
        return cars;
    }

    @Bean
    CarDao carDao() {
        return new CarDaoImp();
    }

    @Bean
    IService service() {
        return new IServiceImp();
    }
}
