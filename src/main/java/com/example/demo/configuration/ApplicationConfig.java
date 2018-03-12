package com.example.demo.configuration;


import com.mongodb.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.example.demo.bean")
@EnableMongoRepositories({ "com.example.demo.repositories" })
public class ApplicationConfig {
//
//    @Bean
//    public MongoDbFactory mongoDbFactory() throws Exception {
//
//        MongoClient mongoClient = new MongoClient("localhost", 27017);
//
//        UserCredentials userCredentials = new UserCredentials("", "");
//
//        return new SimpleMongoDbFactory (mongoClient, "testjava");
//
//    }
@Bean
public MongoDbFactory mongoDbFactory() throws Exception {

    String dbURI = "mongodb+srv://admin:mo12QA1!@cluster0-a2uy0.mongodb.net/test";
    MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
    return new SimpleMongoDbFactory(mongoClient, "test");
}

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;

    }

}