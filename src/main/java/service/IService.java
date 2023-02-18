package service;

import model.Car;

import java.util.List;

public interface IService {
    List<Car> getCarsList(int count);
}
