package com.algaworks.algamoneyapi.resources;

import com.algaworks.algamoneyapi.domains.Categoria;
import com.algaworks.algamoneyapi.services.CategoriaService;
import com.algaworks.algamoneyapi.services.dto.CategoriaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaDTO> listarTodasCategorias() {

        return categoriaService.listarTodasCategorias();
    }

    @GetMapping(value="/{id}")
    public CategoriaDTO buscaCategoriaPorId(@PathVariable Long id) {

        return categoriaService.findCategoria(id);
    }

    @PostMapping
    public void save(@Valid @RequestBody CategoriaDTO categoriaDTO){

        categoriaService.save(categoriaDTO);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value="/{id}")
    public void atualiza(@Valid @RequestBody CategoriaDTO categoriaDTO, @PathVariable Long id){

        CategoriaDTO cat = categoriaService.findCategoria(id);

        categoriaService.save(cat);
    }
}