package com.eureka.superheroestopsecret.controller;

import com.eureka.superheroestopsecret.model.Superheroe;
import com.eureka.superheroestopsecret.service.OrganizacionService;
import com.eureka.superheroestopsecret.service.SuperheroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/superheroes")
public class SuperheroeController {
    @Autowired
    private SuperheroeService superheroeService;

    @Autowired
    private OrganizacionService organizacionService;
    @PostMapping
    public Superheroe createSuperheroe(@RequestBody Superheroe superheroe){
        superheroe.setOrganizacion(organizacionService.getOrganizacionById(superheroe.getOrganizacion().getId()));
        return superheroeService.createSuperheroe(superheroe);
    }
    @GetMapping
    public List<Superheroe> getAllSuperheroes(){
        return superheroeService.getAllSuperheroes();
    }
    @GetMapping("{id}")
    public Superheroe getOrganizationById(@PathVariable("id") Long id){
        return superheroeService.getSuperheroeById(id);
    }
    @DeleteMapping("{id}")
    public void deleteOrganizationById(@PathVariable("id") Long id){
        superheroeService.deleteSuperheroe(id);
    }
}
