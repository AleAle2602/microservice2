package com.microservice.devices.service;

import com.microservice.devices.client.request.PermissionClient;
import com.microservice.devices.entities.Device;
import com.microservice.devices.persistane.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements IDeviceService{

    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private PermissionClient permissionClient;

    @Override
    public List<Device> findAll() {return (List<Device>) deviceRepository.findAll();}

    @Override
    public Device findById(Long id) {return deviceRepository.findById(id).orElseThrow();}

    @Override
    public void save(Device device) {deviceRepository.save(device);
    }

    @Override
    public void deleteById(Long id) {deviceRepository.deleteById(id);}


    @Override
    public Long getCodeByOwnerId(Long ownerId) {return permissionClient.getCodeByOwnerId(ownerId);}


}
