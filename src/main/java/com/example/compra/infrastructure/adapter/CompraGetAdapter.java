package com.example.compra.infrastructure.adapter;

import com.example.compra.application.CompraGet;
import com.example.compra.domain.entities.Compra;
import com.example.compra.domain.service.CompraGetService;
import com.example.compra.infrastructure.dto.CompraDto;
import com.example.compra.infrastructure.mapper.CompraMapper;
import com.example.compra.infrastructure.repository.CompraRepository;
import com.example.compra.share.CompraNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
@Slf4j
public class CompraGetAdapter implements CompraGetService {

    private final CompraMapper compraMapper;
    private final CompraRepository compraRepository;

    @Override
    public Compra getCompra(String id) {
        Optional<CompraDto> compraDto = compraRepository.findById(id);
        log.info("Found " + compraDto);
        if (!compraDto.isEmpty()){
            return  compraDto.map(compraMapper::toEntity).orElse(null);
        } else{
            log.info("COMPRA NO ENCONTRADA");
            throw new CompraNotFoundException("Compra No Encontrada");
        }
    }
}
