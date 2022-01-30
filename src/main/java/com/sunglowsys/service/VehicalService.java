package com.sunglowsys.service;

import com.sunglowsys.repository.VehicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicalService {


    @Autowired
    @Qualifier("bikeBean")
    private VehicalRepository vehicalRepository;

    public void  VehicalRepository() {
        vehicalRepository.start();
        vehicalRepository.stop();
    }

}
