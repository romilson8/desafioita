package com.desafio.itau.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.service.CondominioService;

@RestController
@RequestMapping("/condominio")
public class CondominioController {
	
	@Autowired
	private CondominioService categoriaService;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Condominio> buscarPorId(@PathVariable Integer id){
		
		Condominio condominio = categoriaService.buscar(id);
		return ResponseEntity.ok(condominio);
	}

}
