package com.proyecto.proyecto.DTO;

import lombok.Data;

import java.sql.Time;

@Data
public class CitasDTO {
    private Integer id;
    private java.sql.Date fecha;
    private Time hora;
    private Integer usuarioId;

}
