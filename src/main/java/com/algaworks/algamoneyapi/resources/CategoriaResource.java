package com.algaworks.algamoneyapi.resources;

import com.algaworks.algamoneyapi.service.CategoriaService;
import com.algaworks.algamoneyapi.service.dto.CategoriaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    private List<CategoriaDto> buscarCategorias(){
        return  categoriaService.findCategorias();
    }
}
