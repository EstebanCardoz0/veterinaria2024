package org.example.veterinaria2024.Service;

import org.example.veterinaria2024.entity.Duenio;
import org.example.veterinaria2024.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService
        implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepo;

    @Override
    public void createDuenio(Duenio duen) {

        duenioRepo.save(duen);
    }

    @Override public List<Duenio> getDuenios() {
        return duenioRepo.findAll();
    }

    @Override public Duenio getDuenio(Long id) {
        return duenioRepo.findById(id).get();
    }

    @Override public void deleteDuenio(Long id) {

        duenioRepo.deleteById(id);
    }

    @Override
    public void editDuenio(Duenio duen) {

        this.createDuenio(duen);

    }
}
