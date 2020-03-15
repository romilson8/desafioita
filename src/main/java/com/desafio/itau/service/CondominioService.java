package com.desafio.itau.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.dto.CondominioDTO;
import com.desafio.itau.repository.CondominioRepository;
import com.desafio.itau.repository.filter.CondominioFilter;
import com.desafio.itau.service.exceptions.ObjectNotFoundException;

@Service
public class CondominioService implements ICondominioService {

	
	private final CondominioRepository condominioRepository;

	@Autowired
	public CondominioService(CondominioRepository condominioRepository, ModelMapper mapper) {
		this.condominioRepository = condominioRepository;
		this.mapper = mapper;
	}

	private final ModelMapper mapper;

	@Override
	public Condominio buscar(Integer id) {
		Optional<Condominio> condominio = condominioRepository.findById(id);

		return condominio.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Condominio.class.getName()));
	}

	@Override
	public Page<Condominio> pesquisar(CondominioFilter condominioFilter, Pageable pageable) {
		return condominioRepository.filtrar(condominioFilter, pageable);
	}

	@Override
	public List<Condominio> buscarLista() {
		return condominioRepository.findAll();
	}

	@Override
	public CondominioDTO converter(Condominio condominio) {

		CondominioDTO condominioDTO = mapper.map(condominio, CondominioDTO.class);
		return condominioDTO;
	}

	@Override
	public List<CondominioDTO> converter(List<Condominio> condominios) {

		List<CondominioDTO> condominioDTO = 
				condominios.stream()
				.map(obj -> CondominioDTO.builder()
						.id(obj.getId())
						.nome(obj.getNome())
						.email(obj.getEmail())
						.numeroDeApt(obj.getNumeroDeApt())
						.despesas(obj.getDespesas())
						.apartamentos(obj.getApartamentos())
						.build())
				.collect(Collectors.toList());
		return condominioDTO;
	}
}
