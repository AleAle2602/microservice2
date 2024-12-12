package com.microservice.drivers.services;

import com.microservice.drivers.entities.Driver;
import com.microservice.drivers.persistance.DriversRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriversServiceImpl implements IDriversService {

    @Autowired
    private DriversRepository driversRepository;

    @Override
    public List<Driver> findAll() {return (List<Driver>) driversRepository.findAll();}

    @Override
    public Driver findById(Long id) {return driversRepository.findById(id).orElseThrow();}

    @Override
    public void save(Driver driver) {driversRepository.save(driver);}

    @Override
    public void delete(Long id) {driversRepository.deleteById(id);}
}
