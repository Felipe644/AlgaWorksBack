package com.algaworks.algamoneyapi.services.dto;

import com.algaworks.algamoneyapi.domains.Endereco;

import javax.persistence.Embedded;
import java.io.Serializable;

public class PessoaDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private  String nome;

    @Embedded
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
