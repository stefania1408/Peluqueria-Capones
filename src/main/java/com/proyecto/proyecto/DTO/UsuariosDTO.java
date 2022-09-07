package com.proyecto.proyecto.DTO;

import lombok.Data;

import java.math.BigInteger;

@Data
public class UsuariosDTO {
    private String nombre;
    private String apellido;
    private Integer id;
    private String email;
    private BigInteger telefono;
    private Byte admin;
    private Integer confirmado;
    private String token;

}
