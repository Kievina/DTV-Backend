package com.zipcode.controllers;


import com.zipcode.models.Admin;
import com.zipcode.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;


    @PostMapping("/admin/create")
    public ResponseEntity<Boolean> newAdmin(@RequestBody Admin admin){
        return new ResponseEntity<>(adminService.newAdmin(admin), HttpStatus.CREATED);
    }

    @PutMapping("/admin/update/{id}")
    public ResponseEntity<Boolean> updateAdmin(@PathVariable Long id, @RequestBody Admin admin){
        return new ResponseEntity<>(adminService.updateAdmin(id, admin), HttpStatus.OK);
    }

    @DeleteMapping("/admin/delete/{id}")
    public ResponseEntity<Boolean> deleteAdmin(@PathVariable Long id){
        return new ResponseEntity<>(adminService.deleteAdmin(id), HttpStatus.OK);
    }

    @GetMapping("/admin/{id}")
    public ResponseEntity<Admin> findById(@PathVariable Long id){
        return new ResponseEntity<>(adminService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/admins")
    public ResponseEntity<Iterable<Admin>> findAll(){
        return new ResponseEntity<>(adminService.findAll(), HttpStatus.OK);
    }


}
