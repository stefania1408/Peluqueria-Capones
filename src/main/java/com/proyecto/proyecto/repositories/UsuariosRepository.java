package com.proyecto.proyecto.repositories;

import com.proyecto.proyecto.entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
}