package com.example.domain.mappers

interface Mapper <I,O>{
    fun dtoToEntity(input:I):O
    fun entityToDto(input:O):I
    fun dtoListToEntityList(input:List<I>):List<O>
    fun entityListToDtoList(input:List<O>):List<I>
}