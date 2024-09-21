package com.example.apirest.entities;
import lombok.*;
import org.hibernate.envers.Audited;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "autor")
@Data
@Audited
public class Autor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String biografia;

    @ManyToMany(mappedBy = "autores")
    private Set<Libro> libros = new HashSet<>();
}
