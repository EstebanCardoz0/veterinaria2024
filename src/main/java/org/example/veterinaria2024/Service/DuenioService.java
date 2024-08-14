package org.example.veterinaria2024.Service;

import org.example.veterinaria2024.entity.Duenio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService
        implements IDuenioService {
    @Override
    public void createDuenio(Duenio duen) {

    }

    @Override public List<Duenio> getDuenios() {
        return List.of();
    }

    @Override public Duenio getDuenio(Long id) {
        return null;
    }

    @Override public void deleteDuenio(Long id) {

    }

    @Override
    public void editDuenio(Duenio duen) {

    }
}
