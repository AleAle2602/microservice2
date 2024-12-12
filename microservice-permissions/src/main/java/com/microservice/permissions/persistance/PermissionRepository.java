package com.microservice.permissions.persistance;

import com.microservice.permissions.entities.Permission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionRepository extends CrudRepository<Permission, Long> {
    List<Permission> findAllByOwnerId(Long ownerId);

    Long id(Long id);
}
