package com.zipcode.services;

import com.zipcode.models.Ambassador;
import com.zipcode.repositories.AmbassadorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmbassadorService {

    @Autowired
    private AmbassadorRepo ambassadorRepo;

    public Boolean newAmbassador(Ambassador ambassador){
        Ambassador newAmbassador = new Ambassador();
        newAmbassador.setFirstName(ambassador.getFirstName());
        newAmbassador.setLastName(ambassador.getLastName());
        newAmbassador.setPhoneNumber(ambassador.getPhoneNumber());
        ambassadorRepo.save(ambassador);
        return true;
    }

    public Boolean deleteAmbassador(Long id){
        if(ambassadorRepo.existsById(id)){
            ambassadorRepo.deleteById(id);
            return true;
        }
        return false;
    }

    public Boolean updateAmbassador(Long id, Ambassador ambassador){
        if(ambassadorRepo.existsById(id)){
            Ambassador updateAmbassador = findById(id);
            updateAmbassador.setFirstName(ambassador.getFirstName());
            updateAmbassador.setLastName(ambassador.getLastName());
            updateAmbassador.setPhoneNumber(ambassador.getPhoneNumber());
            ambassadorRepo.save(updateAmbassador);
            return true;
        }
        return false;
    }

    // GET methods

    public Ambassador findById(Long id){
        return ambassadorRepo.findById(id).get();
    }

    public Iterable<Ambassador> findAll(){
        return ambassadorRepo.findAll();
    }

}
