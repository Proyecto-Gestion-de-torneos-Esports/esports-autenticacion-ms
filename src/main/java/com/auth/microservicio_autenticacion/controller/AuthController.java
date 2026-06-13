package com.auth.microservicio_autenticacion.controller;

import com.auth.microservicio_autenticacion.dto.AuthRequestDTO;
import com.auth.microservicio_autenticacion.dto.AuthResponseDTO;
import com.auth.microservicio_autenticacion.security.JwtService;
import com.auth.microservicio_autenticacion.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    private final JwtService jwtService;

    @PostMapping("/register")
    public ResponseEntity<?> registrar(@Valid @RequestBody AuthRequestDTO dto) {
        AuthResponseDTO auth = authService.registrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(auth);
    }

    @PostMapping("/login")
    public ResponseEntity<?> inicioSesion(@RequestBody Map<String, String> credenciales) {
        AuthResponseDTO auth = authService.login(credenciales.get("nombreUsuario"), credenciales.get("contrasena"));
        return ResponseEntity.status(HttpStatus.OK).body(auth);

    }

    @GetMapping("/validarToken")
    public ResponseEntity<?> validarToken(@RequestHeader("Authorization") String token) {
        AuthResponseDTO auth = authService.validarToken(token);
        return ResponseEntity.status(HttpStatus.OK).body(auth);
    }
}
