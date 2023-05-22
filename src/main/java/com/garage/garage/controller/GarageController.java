package com.garage.garage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @GetMapping("/cars")
    List<Car> getcars() {
        return garageService.getCars();
    }

    @GetMapping("/car/{id}")
    Car getCar(@PathVariable long id) {
        return garageService.getCar(id);
    }

    @DeleteMapping("/car/{id}")
    void deleteCar(@PathVariable long id) {

        garageService.deleteCar(id);
    }

    @PostMapping("/cars")
    public void addCar(@RequestBody Car car) {

        garageService.addCar(car);
    }

    @PutMapping("/car/{id}")
    public void updateCar(@RequestBody Car car, @PathVariable int id) {
        garageService.updateCar(car, id);
    }

}
