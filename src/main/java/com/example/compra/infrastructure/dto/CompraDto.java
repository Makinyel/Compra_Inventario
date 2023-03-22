package com.example.compra.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class CompraDto {
    @Id
    private String id;
    private String idProducto;
    private String cantidad;

    public CompraDto(String id, String idProducto, String cantidad) {
        this.id = id;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }
}
