package com.auth.microservicio_autenticacion.repository;


import com.auth.microservicio_autenticacion.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthRepository extends JpaRepository<Auth, Long> {

    Optional<Auth> findByNombreUsuario(String nombreUsuario);
}
