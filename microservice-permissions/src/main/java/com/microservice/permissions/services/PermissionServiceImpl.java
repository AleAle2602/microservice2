package com.microservice.permissions.services;


import com.microservice.permissions.entities.Permission;
import com.microservice.permissions.persistance.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<Permission> findAll() {
        return (List<Permission>) permissionRepository.findAll();
    }

    @Override
    public Permission findById(Long id) {
        return permissionRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Permission permission) {
        permissionRepository.save(permission);
    }

    @Override
    public void deleteById(Long id) {
        permissionRepository.deleteById(id);
    }

    @Override
    public List<Permission> findByIdOwner(Long idOwner) {return permissionRepository.findAllByOwnerId(idOwner);}

    public Long checkAdmin(Long idOwner, List<Permission> permissions) {
        long admin = 0;
        for (int i = 0; i < permissions.size(); i++) {
            if ("ADMIN".equals(permissions.get(i).getPropertyClassName())){
                admin = 301;
                break;
            }
        }
        return admin;
    }
}
