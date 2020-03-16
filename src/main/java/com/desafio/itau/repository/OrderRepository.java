package com.desafio.itau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.desafio.itau.dominio.Pedido;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Pedido, Integer> {
	
		
}
