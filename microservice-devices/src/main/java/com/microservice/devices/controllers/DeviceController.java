package com.microservice.devices.controllers;

import com.microservice.devices.entities.Device;
import com.microservice.devices.persistane.DeviceRepository;
import com.microservice.devices.service.DeviceServiceImpl;
import com.microservice.devices.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    @Autowired
    private IDeviceService deviceService;

    @Autowired
    private DeviceServiceImpl deviceServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Device device) {
        deviceService.save(device);
        return ResponseEntity.status(HttpStatus.CREATED).body("Device created");
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllDeices() {   return ResponseEntity.ok(deviceService.findAll());}

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findDevicesById(@PathVariable Long id) {return ResponseEntity.ok(deviceService.findById(id));}

    @GetMapping("/checkbyownerid/{id}")
    public ResponseEntity<?> testCheckAdmin(@PathVariable Long id) {return ResponseEntity.ok((deviceService.getCodeByOwnerId(id)));}

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        deviceService.deleteById(id);
        return ResponseEntity.ok("Device deleted");
    }

}
