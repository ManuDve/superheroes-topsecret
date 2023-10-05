package com.eureka.superheroestopsecret.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name= "organizaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organizacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name="es_publico")
    private Boolean publico;
    @Column(name="primera_aparicion")
    private LocalDate fecha;
    @OneToMany(
            mappedBy = "organizacion",
            cascade = CascadeType.ALL
    )
    @JsonManagedReference
    private List<Superheroe> superheroes;
}
