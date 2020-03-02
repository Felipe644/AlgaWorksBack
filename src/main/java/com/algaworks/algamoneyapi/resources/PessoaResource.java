package com.algaworks.algamoneyapi.resources;

import com.algaworks.algamoneyapi.services.CategoriaService;
import com.algaworks.algamoneyapi.services.dto.CategoriaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaDTO> listarTodasCategorias() {

        return categoriaService.listarTodasCategorias();
    }

    @PostMapping
    public void save(@Valid @RequestBody CategoriaDTO categoriaDTO){

        categoriaService.save(categoriaDTO);
    }

}
