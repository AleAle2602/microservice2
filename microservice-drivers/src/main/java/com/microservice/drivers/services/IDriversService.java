package com.microservice.drivers.services;

import com.microservice.drivers.entities.Driver;

import java.util.List;

public interface IDriversService {

    List<Driver> findAll();

    Driver findById(Long id);

    void save(Driver driver);

    void delete(Long id);
}
