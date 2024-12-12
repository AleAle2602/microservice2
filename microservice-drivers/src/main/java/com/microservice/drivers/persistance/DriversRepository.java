package com.microservice.drivers.persistance;

import com.microservice.drivers.entities.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriversRepository extends CrudRepository<Driver, Long> {
}
