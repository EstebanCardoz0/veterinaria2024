package org.example.veterinaria2024.repository;

import org.example.veterinaria2024.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMascotaRepository extends
        JpaRepository<Mascota, Long> {

    @Query("select m from Mascota m where m"+
                  ".especie = 'perro' and m"+
                  ".raza = 'caniche'")

    public List<Mascota> getPerroCaniche();
}
