package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImp implements CarDAO {
    private final List<Car> showListCar = new ArrayList<>();

    {
        showListCar.add(new Car("Kia", "Sportage", 2022));
        showListCar.add(new Car("BMW", "M5", 2018));
        showListCar.add(new Car("Toyota", "Camry", 2019));
        showListCar.add(new Car("Mercedes", "E200", 2020));
        showListCar.add(new Car("Porsche", "Taycan", 2021));
    }

    @Override
    public List<Car> getCars(int count) {
        if(count == 0){
            return showListCar;
        }
        return showListCar.stream().limit(count).collect(Collectors.toList());
    }
}
