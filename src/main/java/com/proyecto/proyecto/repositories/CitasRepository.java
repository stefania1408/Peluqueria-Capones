package com.proyecto.proyecto.repositories;

import com.proyecto.proyecto.entities.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasRepository extends JpaRepository<Citas, Integer> {
}