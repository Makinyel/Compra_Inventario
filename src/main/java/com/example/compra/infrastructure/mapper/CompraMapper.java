package com.example.compra.infrastructure.mapper;


import com.example.compra.domain.entities.Compra;
import com.example.compra.infrastructure.dto.CompraDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CompraMapper {
    CompraDto toDto(Compra compra);
    Compra toEntity(CompraDto compraDto);

}
