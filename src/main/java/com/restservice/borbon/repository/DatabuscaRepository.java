package com.restservice.borbon.repository;

import com.restservice.borbon.entity.Databusca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabuscaRepository extends JpaRepository<Databusca,String> {

    Databusca findByCpf(String cpf);
}
