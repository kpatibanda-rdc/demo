package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Car;
import com.example.demo.repositories.CarRepository;

@Service("carService")
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepo;

    @Override
    public void create(Car car) {
        Car c = carRepo.insert(car);
        System.out.println("Created:- " + c);
    }

    @Override
    public void update(Car car) {
        Car c = carRepo.save(car);
        System.out.println("Updated:- " + c);

    }

    @Override
    public void delete(Car car) {
        carRepo.delete(car);
        System.out.println("Deleted:- " + car.getId());
    }

    @Override
    public List < Car > findAll() {
        return carRepo.findAll();
    }

    @Override
    public List < Car > findByBrand(String brand) {
        return carRepo.findByBrand(brand);
    }

    @Override
    public Car findByModel(String model) {
        return carRepo.findByModel(model);
    }

    @Override
    public void deleteAll() {
        carRepo.deleteAll();
    }

    @Override
    public Car find(Car car) {
       return carRepo.findOne(car.getId());
    }
}