package com.example.simple_board.crud;

public interface Converter<DTO, ENTITY> {

    DTO toDto(ENTITY entity);
    ENTITY toEntity(DTO dto);
}