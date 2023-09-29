package com.eureka.superheroestopsecret.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "organizaciones")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Organizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name="esta_vigente")
    private Boolean vigencia;
    @OneToMany(mappedBy = "organizacion")
    private List<Superheroe> superheroes;
}
