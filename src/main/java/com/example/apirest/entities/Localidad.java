package com.example.apirest.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.envers.Audited;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Data
@Audited
public class Localidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;

    @OneToMany(mappedBy = "localidad")
    @JsonBackReference
    private Set<Domicilio> domicilios = new HashSet<>();

    @Override
    public String toString() {
        return "Localidad{" +
                "id=" + id +
                ", denominacion='" + denominacion +
                '}';
    }
}
