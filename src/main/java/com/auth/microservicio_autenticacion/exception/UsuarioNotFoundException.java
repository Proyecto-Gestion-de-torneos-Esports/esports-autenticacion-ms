package com.auth.microservicio_autenticacion.exception;

public class UsuarioNotFoundException extends RuntimeException{

    public UsuarioNotFoundException(String mensaje){
        super(mensaje);
    }
}
