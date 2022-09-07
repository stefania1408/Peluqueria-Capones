package com.proyecto.proyecto.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private Long telefono;

    @Column(name = "admin")
    private Byte admin;

    @Column(name = "confirmado")
    private Integer confirmado;

    @Column(name = "token")
    private String token;

    @Override
    public String toString() {
        return "Usuarios{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                ", admin=" + admin +
                ", confirmado=" + confirmado +
                ", token='" + token + '\'' +
                '}';
    }
}
