package org.example.veterinaria2024.controller;

import org.example.veterinaria2024.Service.IMascotaService;
import org.example.veterinaria2024.dto.DTOmascota;
import org.example.veterinaria2024.entity.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/mascota")
public class MascotaController {

    @Autowired
    IMascotaService mascoServi;

    @PostMapping("/create")
    public String createMascota(@RequestBody
                                Mascota mas) {

        mascoServi.createMascota(mas);

        return "Mascota creada con exito";
    }

    @GetMapping("/get/{id}")
    public Mascota getMascota(
            @PathVariable Long id) {
        return mascoServi.getMascota(id);
    }

    @GetMapping("/getAll")
    public List<Mascota> getMascotas() {
        return mascoServi.getMascotas();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMascota(
            @PathVariable Long id) {
        mascoServi.deleteMascota(id);
        return "Mascota eliminada con exito";
    }

    @PutMapping("/edit")
    public String editMascota(
            @RequestBody Mascota mas) {


        mascoServi.editMascota(mas);
        return "Mascota editada con exito";
    }

    @GetMapping("/getPerCan")
    public List<Mascota> getPerroCaniche() {
        return mascoServi.getPerroCaniche();
    }

    @GetMapping("/getDTO/{id}")
    public DTOmascota getDTO(
            @PathVariable Long id) {
        return mascoServi.mascoDTO(id);
    }


}
