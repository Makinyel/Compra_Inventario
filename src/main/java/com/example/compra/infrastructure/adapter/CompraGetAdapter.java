package com.example.compra.infrastructure.adapter;

import com.example.compra.domain.entities.Compra;
import com.example.compra.domain.service.CompraGetService;
import com.example.compra.infrastructure.dto.CompraDto;
import com.example.compra.infrastructure.mapper.CompraMapper;
import com.example.compra.infrastructure.repository.CompraRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class CompraGetAdapter implements CompraGetService {

    private final CompraMapper compraMapper;
    private final CompraRepository compraRepository;

    @Override
    public Compra getCompra(String id) {
        Optional<CompraDto> compraDto = compraRepository.findById(id);
        return  compraDto.map(compraMapper::toEntity).orElse(null);
    }
}
