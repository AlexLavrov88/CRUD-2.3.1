package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCarList();

    List<Car> getCarById(int index);
}