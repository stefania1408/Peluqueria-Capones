package com.proyecto.proyecto.DTO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ServiciosDTO {
    private Integer id;
    private String nombre;
    private BigDecimal precio;

}
