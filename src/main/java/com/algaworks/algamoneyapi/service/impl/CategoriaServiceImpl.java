package com.algaworks.algamoneyapi.service.impl;


import com.algaworks.algamoneyapi.repository.CategoriaRepository;
import com.algaworks.algamoneyapi.resources.CategoriaResource;
import com.algaworks.algamoneyapi.service.CategoriaService;
import com.algaworks.algamoneyapi.service.dto.CategoriaDto;
import com.algaworks.algamoneyapi.service.mapper.CategoriaMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    private final CategoriaMapper categoriaMapper;

    @Override
    public List<CategoriaDto>findCategorias(){
        return categoriaMapper.toDto(categoriaRepository.findAll());
    }
}
