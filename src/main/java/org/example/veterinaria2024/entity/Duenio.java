package org.example.veterinaria2024.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity @Data @AllArgsConstructor
@NoArgsConstructor
public class Duenio {

    @Id @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Long idDuenio;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;

    @OneToMany(mappedBy = "duenio")
    private List<Mascota> mascotas;
}
