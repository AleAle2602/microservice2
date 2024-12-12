package com.microservice.drivers.controllers;

import com.microservice.drivers.entities.Driver;
import com.microservice.drivers.services.IDriversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
public class DriversController {

    @Autowired
    private IDriversService driversService;

    @PostMapping("/create/{12345}")
    public ResponseEntity<String> create(@RequestBody Driver driver) {return ResponseEntity.status(HttpStatus.CREATED).body("Driver created");}

    @GetMapping("/all")
    public ResponseEntity<?> findAllDrivers() {return ResponseEntity.ok(driversService.findAll());}

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findDriverById(@PathVariable Long id) {return ResponseEntity.ok(driversService.findById(id));}

    @DeleteMapping("/delete/{id}/{12345}")
    public ResponseEntity<String> delete(@PathVariable Long id) {driversService.delete(id); ResponseEntity.status(HttpStatus.OK).body("Driver deleted");}

}
