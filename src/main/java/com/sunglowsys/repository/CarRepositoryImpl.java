package com.sunglowsys.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
public class CarRepositoryImpl implements VehicalRepository{
    @Override
    public void start() {
        System.out.println("car is started");

    }

    @Override
    public void stop() {
        System.out.println("car is stoppped");

    }
}
