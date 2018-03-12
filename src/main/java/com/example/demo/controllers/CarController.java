package com.example.demo.controllers;

import com.example.demo.bean.Car;
import com.example.demo.configuration.ApplicationConfig;
import com.example.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {


    @Autowired
    AbstractApplicationContext context;

    @PostMapping("/savecar")
    public Car saveCar(@RequestBody Car car)
    {
        //test branches comment
        CarService carService = (CarService)context.getBean ("carService");

        carService.create(car);
        return car;
    }
}
