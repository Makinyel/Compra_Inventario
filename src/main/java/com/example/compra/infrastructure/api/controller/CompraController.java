package com.example.compra.infrastructure.api.controller;

import com.example.compra.application.CompraGet;
import com.example.compra.application.CompraSave;
import com.example.compra.domain.entities.Compra;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@Slf4j
@RequestMapping(path = "/compra")
public class CompraController {

    private final CompraSave compraSave;
    private final CompraGet  compraGet;

    @PostMapping
    public ResponseEntity<Compra> addCompra(@RequestBody Compra compra, @RequestHeader String idCliente){
        return ResponseEntity.ok(compraSave.saveCompra(compra,idCliente));
    }
    @GetMapping
    public ResponseEntity<Compra> getCompra(@RequestHeader String id){
        return ResponseEntity.ok(compraGet.getCompra(id));
    }

}
