package com.algaworks.algamoneyapi.services.mapper;

import com.algaworks.algamoneyapi.domains.Pessoa;
import com.algaworks.algamoneyapi.services.dto.PessoaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {
}
