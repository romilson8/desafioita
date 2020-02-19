package com.desafio.itau.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.repository.CondominioRepository;
import com.desafio.itau.service.exceptions.ObjectNotFoundException;

@Service
public class CondominioService {
	
	@Autowired
	private CondominioRepository condominioRepository;
	
	public Condominio buscar(Integer id) {
		Optional<Condominio> condominio = condominioRepository.findById(id);
		
		return condominio.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Condominio.class.getName()));
	}

}
