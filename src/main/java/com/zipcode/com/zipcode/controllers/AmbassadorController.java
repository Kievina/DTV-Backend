package com.zipcode.controllers;


import com.zipcode.models.Ambassador;
import com.zipcode.services.AmbassadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AmbassadorController {

    @Autowired
    private AmbassadorService ambassadorService;

    @PostMapping("/ambassador/create")
    public ResponseEntity<Boolean> newAmbassador (@RequestBody Ambassador ambassador){
        return new ResponseEntity<>(ambassadorService.newAmbassador(ambassador), HttpStatus.CREATED);
    }

    @DeleteMapping("/ambassador/delete/{id}")
    public ResponseEntity<Boolean> deleteAmbassador(@PathVariable Long id){
        return new ResponseEntity<>(ambassadorService.deleteAmbassador(id), HttpStatus.OK);
    }

    @PutMapping("/ambassador/update/{id}")
    public ResponseEntity<Boolean> updateAmbassador(@PathVariable Long id, @RequestBody Ambassador ambassador){
        return new ResponseEntity<>(ambassadorService.updateAmbassador(id, ambassador), HttpStatus.OK);
    }

    @GetMapping("/ambassador/{id}")
    public ResponseEntity<Ambassador> findById(@PathVariable Long id){
        return new ResponseEntity<>(ambassadorService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/ambassadors")
    public ResponseEntity<Iterable<Ambassador>> findAll(){
        return new ResponseEntity<>(ambassadorService.findAll(), HttpStatus.OK);
    }




}
