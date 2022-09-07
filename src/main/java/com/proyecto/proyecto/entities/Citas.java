package com.proyecto.proyecto.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Time;

@Data
@Entity
@Table(name = "citas")
public class Citas implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "fecha")
    private java.sql.Date fecha;

    @Column(name = "hora")
    private Time hora;

    @Column(name = "usuarioId")
    private Integer usuarioId;

}
