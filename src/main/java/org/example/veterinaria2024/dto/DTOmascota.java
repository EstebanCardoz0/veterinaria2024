package org.example.veterinaria2024.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class DTOmascota {

    private String nombreMascota;
    private String especieMascota;
    private String razaMascota;
    private String nombreDuenio;
    private String apellidoDuenio;


}
