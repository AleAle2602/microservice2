package com.microservice.permissions.controller;

import com.microservice.permissions.entities.Permission;
import com.microservice.permissions.persistance.PermissionRepository;
import com.microservice.permissions.services.IPermissionService;
import com.microservice.permissions.services.PermissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {

    @Autowired
    private IPermissionService permissionService;

    @Autowired
    private PermissionServiceImpl permissionServiceImpl;
    @Autowired
    private PermissionRepository permissionRepository;

    @PostMapping("/create/{pswrd}")
    public ResponseEntity<String> savePermission(@RequestBody Permission permission, @PathVariable String pswrd) {
        if (pswrd.equals("12345")) {
            permissionService.save(permission);
            return ResponseEntity.status(HttpStatus.CREATED).body("Permission created successfully");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("You are not authorized");
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllPermissions() {
        return ResponseEntity.ok(permissionService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {return ResponseEntity.ok(permissionService.findById(id));}

    @GetMapping("/search-by-owner/{idOwner}")
    public ResponseEntity<?> testCheckAdmnin(@PathVariable Long idOwner) {
        return ResponseEntity.ok(permissionServiceImpl.checkAdmin(idOwner, permissionService.findByIdOwner(idOwner)));
    }

    @DeleteMapping("/delete/{id}/{pswrd}")
    public ResponseEntity<String> deletePermission(@PathVariable Long id, @PathVariable String pswrd) {
        if (pswrd.equals("12345")) {
            permissionService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Permission deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("You are not authorized");
        }
    }

}

