package org.example.veterinaria2024.Service;

import org.example.veterinaria2024.dto.DTOmascota;
import org.example.veterinaria2024.entity.Mascota;
import org.example.veterinaria2024.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService
        implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public void createMascota(Mascota mascota) {

        mascoRepo.save(mascota);

    }

    @Override public List<Mascota> getMascotas() {
        return mascoRepo.findAll();
    }

    @Override public Mascota getMascota(Long id) {
        return mascoRepo.findById(id).get();
    }

    @Override public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public void editMascota(Mascota masco) {
        this.createMascota(masco);
    }

    @Override
    public List<Mascota> getPerroCaniche() {
        return mascoRepo.getPerroCaniche();
    }

    @Override
    public DTOmascota mascoDTO(Long id) {

        Mascota masco = this.getMascota(id);
        DTOmascota masDTO =
                new DTOmascota(masco.getNombre(),
                        masco.getEspecie(),
                        masco.getRaza(),
                        masco.getDuenio()
                                .getNombre(),
                        masco.getDuenio()
                                .getApellido());

        return masDTO;
    }
}
