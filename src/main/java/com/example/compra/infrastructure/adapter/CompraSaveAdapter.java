package com.example.compra.infrastructure.adapter;

import com.example.compra.domain.entities.Compra;
import com.example.compra.domain.service.CompraSaveService;
import com.example.compra.infrastructure.mapper.CompraMapper;
import com.example.compra.infrastructure.repository.CompraRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompraSaveAdapter implements CompraSaveService {
    private final CompraRepository compraRepository;
    private final CompraMapper compraMapper;

    @Override
    public Compra saveCompra(Compra compra) {
        return compraMapper.toEntity(compraRepository.save(compraMapper.toDto(compra)));
    }

}
