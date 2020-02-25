package com.algaworks.algamoneyapi.services.mapper;

import com.algaworks.algamoneyapi.domains.Categoria;
import com.algaworks.algamoneyapi.services.dto.CategoriaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface CategoriaMapper extends EntityMapper<CategoriaDTO, Categoria> {
}
