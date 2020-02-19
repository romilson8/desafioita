package com.desafio.itau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.itau.dominio.Apartamento;

@Repository
public interface ApartamentoRepository extends JpaRepository<Apartamento, Integer> {

}
