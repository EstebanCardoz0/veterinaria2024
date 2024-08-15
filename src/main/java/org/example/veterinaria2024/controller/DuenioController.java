package org.example.veterinaria2024.controller;

import org.example.veterinaria2024.Service.DuenioService;
import org.example.veterinaria2024.Service.IDuenioService;
import org.example.veterinaria2024.entity.Duenio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/duenio")
public class DuenioController {

    @Autowired
    IDuenioService duenioServi;

    @Autowired private DuenioService
            duenioService;

    @PostMapping("/create")
    public String createDuenio(@RequestBody
                               Duenio duen) {
        duenioServi.createDuenio(duen);

        return "Dueño creado con éxito";
    }

    @GetMapping("/get/{id}")
    public Duenio getDuenio(
            @PathVariable Long id) {

        return duenioServi.getDuenio(id);
    }


}
