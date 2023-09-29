package com.eureka.superheroestopsecret.service;

import com.eureka.superheroestopsecret.model.Superheroe;
import com.eureka.superheroestopsecret.repository.SuperheroeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class SuperheroeService {
    @Autowired
    private SuperheroeRepository superheroeRepository;
    public Superheroe createSuperheroe(Superheroe superheroe){
        return superheroeRepository.save(superheroe);
    }
    public Superheroe getSuperheroeById(Long id){
        Optional<Superheroe> superheroeOptional = superheroeRepository.findById(id);
        return superheroeOptional.get();
    }
    public List<Superheroe> getAllOrganitazions(){
        return superheroeRepository.findAll();
    }

    public void deleteSuperheroe(Long id){
        superheroeRepository.deleteById(id);
    }
}
