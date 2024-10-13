package com.xicola.xicola.repository;

import com.xicola.xicola.model.TipoPessoa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPessoaRepository extends JpaRepository<TipoPessoa, Integer> {

    @Query("SELECT tp FROM TipoPessoa tp WHERE tp.descricao = :descricao")
    Optional<TipoPessoa> findTipoPessoa(String descricao);


}
