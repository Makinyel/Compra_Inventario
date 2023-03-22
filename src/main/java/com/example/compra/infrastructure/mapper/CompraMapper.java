package com.example.compra.infrastructure.mapper;


import com.example.compra.domain.entities.Compra;
import com.example.compra.infrastructure.dto.CompraDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CompraMapper {
    CompraDto toDto(Compra compra);
    Compra toEntity(CompraDto compraDto);

}
