package com.desafio.itau.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.dto.CondominioDTO;
import com.desafio.itau.repository.filter.CondominioFilter;

public interface ICondominioService {

	public Condominio buscar(Integer id);

	public Page<Condominio> pesquisar(CondominioFilter condominioFilter, Pageable pageable);

	public List<Condominio> buscarLista();
	
	public CondominioDTO converter(Condominio condominio);
	
	public List<CondominioDTO> converter(List<Condominio> condominios); 

}
