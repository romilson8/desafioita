package com.desafio.itau.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.repository.filter.CondominioFilter;
import com.desafio.itau.service.CondominioService;

@RestController
@RequestMapping("/condominio")
public class CondominioResource {
	
	@Autowired
	private CondominioService condominioService;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Condominio> buscarPorId(@PathVariable Integer id){
		
		Condominio condominio = condominioService.buscar(id);
		return ResponseEntity.ok(condominio);
	}
	
	@GetMapping
	public Page<Condominio> buscar(CondominioFilter condominioFilter, Pageable pageable){
		return condominioService.pesquisar(condominioFilter, pageable);
	}

}
