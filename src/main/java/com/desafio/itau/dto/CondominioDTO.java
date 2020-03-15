package com.desafio.itau.dto;

import java.util.List;

import com.desafio.itau.conversor.CondominioSerializer;
import com.desafio.itau.dominio.Apartamento;
import com.desafio.itau.dominio.Despesa;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize(using = CondominioSerializer.class)
public class CondominioDTO {
	

	private Integer id;
	private String nome;
	private String email;
	private Integer numeroDeApt;
	private double valorRateio;
	private List<Despesa> despesas;
	private List<Apartamento> apartamentos;

}
