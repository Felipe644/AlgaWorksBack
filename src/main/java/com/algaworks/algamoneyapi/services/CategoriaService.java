package com.algaworks.algamoneyapi.services;

import com.algaworks.algamoneyapi.services.dto.CategoriaDTO;

import java.util.List;

public interface CategoriaService {

    List<CategoriaDTO> listarTodasCategorias();

    CategoriaDTO findCategoria(Long id);

    void save(CategoriaDTO categoriaDTO);

    void delete(Long id);
}