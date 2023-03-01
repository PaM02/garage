package com.garage.garage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.garage.garage.model.Car;
import com.garage.garage.service.GarageService;

@RestController
public class GarageController {

    // @RequestMapping("/")
    // public String hello() {

    // return "hello";

    // }

    @Autowired
    private GarageService garageService;

    // @RequestMapping("/")
    // Car getCar() {

    // Car mycar = new Car("lenang", "toyot", 2010, Car.Color.RED);
    // return mycar;
    // }

    @RequestMapping(method = RequestMethod.GET, value = "/cars")
    List<Car> getcars() {
        return garageService.getCars();
    }

    @RequestMapping("/car/{id}")
    Car getCar(@PathVariable long id) {
        return garageService.getCar(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/car/{id}")
    void deleteCar(@PathVariable long id) {

        garageService.deleteCar(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cars")
    public void addCar(@RequestBody Car car) {

        garageService.addCar(car);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/car/{id}")

    public void updateCar(@RequestBody Car car, @PathVariable int id) {
        garageService.updateCar(car, id);
    }

}
