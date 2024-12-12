package com.microservice.devices.service;


import com.microservice.devices.entities.Device;

import java.util.List;

public interface IDeviceService {

    List<Device> findAll();

    Device findById(Long id);

    void save(Device device);

    void deleteById(Long id);

    Long getCodeByOwnerId(Long ownerId);

}
