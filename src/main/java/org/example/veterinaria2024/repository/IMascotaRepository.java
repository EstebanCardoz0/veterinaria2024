package org.example.veterinaria2024.repository;

import org.example.veterinaria2024.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends
        JpaRepository<Mascota, Long> {
}
