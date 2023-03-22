package com.example.compra.application;

import com.example.compra.domain.entities.Compra;
import com.example.compra.domain.service.CompraSaveService;
import com.example.compra.infrastructure.repository.CompraRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompraSave {
    private final CompraRepository compraRepository;
    private final CompraSaveService compraSaveService;
    public Compra saveCompra(Compra compra,String idCliente){
        return compraSaveService.saveCompra(compra);
    }



}
