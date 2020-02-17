package com.algaworks.algamoneyapi.service.mapper;

import com.algaworks.algamoneyapi.domains.Categoria;
import com.algaworks.algamoneyapi.service.dto.CategoriaDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface CategoriaMapper extends EntityMapper<CategoriaDto, Categoria> {


}
