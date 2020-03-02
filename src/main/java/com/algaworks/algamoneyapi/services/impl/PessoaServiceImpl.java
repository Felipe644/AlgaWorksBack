package com.algaworks.algamoneyapi.services.impl;

import com.algaworks.algamoneyapi.repositories.PessoaRepository;
import com.algaworks.algamoneyapi.services.PessoaService;
import com.algaworks.algamoneyapi.services.dto.PessoaDTO;
import com.algaworks.algamoneyapi.services.mapper.PessoaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService{

    @Autowired
    private PessoaRepository pessoaRepository;


    private PessoaMapper pessoaMapper;


    public PessoaServiceImpl(PessoaMapper pessoaMapper){
        this.pessoaMapper = pessoaMapper;
    }

    @Override
    public List<PessoaDTO> listarTodasPessoa(){
        return pessoaMapper.toDto(pessoaRepository.findAll());
    }

    @Override
    public void  save(PessoaDTO pessoaDTO){
        pessoaRepository.save(pessoaMapper.toEntity(pessoaDTO));
    }

}
