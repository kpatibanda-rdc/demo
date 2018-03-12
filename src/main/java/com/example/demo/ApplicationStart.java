package com.example.demo;

import com.example.demo.configuration.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

    @SpringBootApplication
    public class ApplicationStart {

        public static void main(String[] args) {
            SpringApplication.run(ApplicationStart.class, args);

            }
        }

