package com.algaworks.algamoneyapi.repositories;

import com.algaworks.algamoneyapi.domains.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
