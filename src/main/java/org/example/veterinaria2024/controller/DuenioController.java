package org.example.veterinaria2024.controller;

import org.example.veterinaria2024.Service.DuenioService;
import org.example.veterinaria2024.Service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/duenio")
public class DuenioController {

    @Autowired
    IDuenioService duenioServi;
    @Autowired private DuenioService duenioService;

    @PostMapping ("/create")
    public String createDuenio () {
        duenioServi.createDuenio();
        return "Duenio creado con exito";
    }


}
