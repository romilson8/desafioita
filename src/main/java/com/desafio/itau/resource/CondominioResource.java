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
import com.desafio.itau.view.ResponseView;

@RestController
@RequestMapping("/condominio")
public class CondominioResource {
	
	@Autowired
	private ICondominioService condominioService;

	@GetMapping(value="/lista")
	public ResponseEntity<ResponseView> listar(){
		
		List<Condominio> condominio = condominioService.buscarLista();
		List<CondominioDTO> condominioDTO = condominioService.converter(condominio);
		ResponseView response = ResponseView.builder().data(condominioDTO).message("Lista Pronta").success(true).build();
		
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<ResponseView> listar(@PathVariable(value="id") Integer id){
		
		Condominio condominio = condominioService.buscar(id);
		CondominioDTO condominioDTO = condominioService.converter(condominio);
		ResponseView response = ResponseView.builder().data(condominioDTO).message("Lista Pronta").success(true).build();
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping
	public Page<Condominio> buscar(CondominioFilter condominioFilter, Pageable pageable){
		return condominioService.pesquisar(condominioFilter, pageable);
	}

}
