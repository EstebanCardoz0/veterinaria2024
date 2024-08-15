package org.example.veterinaria2024.repository;

import org.example.veterinaria2024.entity.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends
        JpaRepository <Duenio, Long> {


}
