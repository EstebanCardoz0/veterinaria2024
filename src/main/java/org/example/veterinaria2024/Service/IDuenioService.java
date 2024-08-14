package org.example.veterinaria2024.Service;

import org.example.veterinaria2024.entity.Duenio;

import java.util.List;

public interface IDuenioService {

    public void createDuenio(Duenio duen);

    public List<Duenio> getDuenios();

    public Duenio getDuenio(Long id);

    public void deleteDuenio(Long id);

    public void editDuenio(Duenio duen);


}
