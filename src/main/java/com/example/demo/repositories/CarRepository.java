package com.example.demo.repositories;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Car;

@Repository
public interface CarRepository extends MongoRepository < Car, String > {
    @Query("{ 'model' : ?0 }")
    Car findByModel(String model);

    @Query(value = "{ 'brand' : ?0}")
    List < Car > findByBrand(String brand);

    @Query(value = "{ '@id' : ?0}")
    Car  findOne(String id);

}