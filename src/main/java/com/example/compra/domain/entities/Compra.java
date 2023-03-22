package com.example.compra.domain.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Compra {
    @Id
    private String id;
    private String idProducto;
    private String cantidad;

    public Compra(String id, String idProducto, String cantidad) {
        this.id = id;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }
}
