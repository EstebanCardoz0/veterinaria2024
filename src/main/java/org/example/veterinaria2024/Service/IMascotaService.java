package org.example.veterinaria2024.Service;

import org.example.veterinaria2024.entity.Mascota;

import java.util.List;

public interface IMascotaService {

    public void createMascota(Mascota mascota);

    public List<Mascota> getMascotas();

    public Mascota getMascota(Long id);

    public void deleteMascota(Long id);

    public void editMascota(Mascota masco);

    public List<Mascota> getPerroCaniche();


}
