package com.microservice.permissions.services;

import com.microservice.permissions.entities.Permission;

import java.util.List;

public interface IPermissionService {

    List<Permission> findAll();

    Permission findById(Long id);

    void save(Permission permission);

    void deleteById(Long id);

    List<Permission> findByIdOwner(Long idOwner);

}
