package com.algaworks.algamoneyapi.resources;

import com.algaworks.algamoneyapi.services.CategoriaService;
import com.algaworks.algamoneyapi.services.PessoaService;
import com.algaworks.algamoneyapi.services.dto.CategoriaDTO;
import com.algaworks.algamoneyapi.services.dto.PessoaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaDTO> listarTodasPessoa() {

        return pessoaService.listarTodasPessoa();
    }

    @PostMapping
    public void save(@Valid @RequestBody PessoaDTO pessoaDTO){

        pessoaService.save(pessoaDTO);
    }

}
