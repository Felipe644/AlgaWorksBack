package com.algaworks.algamoneyapi.services;

import com.algaworks.algamoneyapi.services.dto.PessoaDTO;

import java.util.List;

public interface PessoaService {

    List<PessoaDTO> listarTodasPessoa();



    void save(PessoaDTO pessoaDTO);
}
