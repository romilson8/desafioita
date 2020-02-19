package com.desafio.itau.repository.condominio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.repository.filter.CondominioFilter;

public interface CondominioRepositoryQuery {
	
	public Page<Condominio> filtrar(CondominioFilter condominioFilter, Pageable pageable);
	
}
