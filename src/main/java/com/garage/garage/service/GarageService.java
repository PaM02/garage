package com.garage.garage.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.garage.garage.model.Car;

@Service
public class GarageService {

    ArrayList<Car> cars = new ArrayList<>(
            Arrays.asList(new Car(1, "lenang", "toyot", 2010, Car.Color.RED),
                    new Car(2, "lenanga", "peugeo", 202, Car.Color.BLUE),
                    new Car(3, "lenangb", "toyot", 203, Car.Color.GREEN)));

    public List<Car> getCars() {
        return cars;
    }

    public Car getCar(long id) {

        return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);

    }

    public void deleteCar(long id) {

        cars.removeIf(car -> car.getId() == id);
    }

    public void addCar(Car car) {

        cars.add(car);
    }

    public void updateCar(Car car, int id) {

        cars.forEach(carIncars -> {
            if (carIncars.getId() == id) {

                cars.set(cars.indexOf(carIncars), car);

            }
        });
    }

}
