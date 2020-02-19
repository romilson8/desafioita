package com.desafio.itau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.repository.condominio.CondominioRepositoryQuery;

@Repository
public interface CondominioRepository extends JpaRepository<Condominio, Integer>, CondominioRepositoryQuery {

}
