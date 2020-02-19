package com.desafio.itau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.itau.dominio.Despesa;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Integer> {

}
