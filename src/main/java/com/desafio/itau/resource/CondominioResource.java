package com.desafio.itau.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.dto.CondominioDTO;
import com.desafio.itau.repository.filter.CondominioFilter;
import com.desafio.itau.service.ICondominioService;

@RestController
@RequestMapping("/condominio")
public class CondominioResource {
	
	@Autowired
	private ICondominioService condominioService;

	@GetMapping(value="/lista")
	public ResponseEntity<List<CondominioDTO>> listar(){
		
		List<Condominio> condominio = condominioService.buscarLista();
		List<CondominioDTO> condominioDTO = condominioService.converter(condominio);
		
		return ResponseEntity.ok().body(condominioDTO);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<CondominioDTO> listar(@PathVariable(value="id") Integer id){
		
		Condominio condominio = condominioService.buscar(id);
		CondominioDTO condominioDTO = condominioService.converter(condominio);
		return ResponseEntity.ok().body(condominioDTO);
	}
	
	@GetMapping
	public Page<Condominio> buscar(CondominioFilter condominioFilter, Pageable pageable){
		return condominioService.pesquisar(condominioFilter, pageable);
	}

}
