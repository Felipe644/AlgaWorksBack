package com.algaworks.algamoneyapi.services.impl;

import com.algaworks.algamoneyapi.repositories.CategoriaRepository;
import com.algaworks.algamoneyapi.services.CategoriaService;
import com.algaworks.algamoneyapi.services.dto.CategoriaDTO;
import com.algaworks.algamoneyapi.services.mapper.CategoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    private CategoriaMapper categoriaMapper;

    public CategoriaServiceImpl(CategoriaMapper categoriaMapper) {
        this.categoriaMapper = categoriaMapper;
    }

    @Override
    public List<CategoriaDTO> listarTodasCategorias() {

        return categoriaMapper.toDto(categoriaRepository.findAll());
    }
}
