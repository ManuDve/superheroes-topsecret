package com.eureka.superheroestopsecret.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name= "superheroes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Superheroe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String alias;
    @Column(name="esta_activo")
    private Boolean vigencia;
    @ManyToOne
    @JoinColumn(name = "organizacion_id", nullable = false)
    @JsonBackReference
    private Organizacion organizacion;

}
