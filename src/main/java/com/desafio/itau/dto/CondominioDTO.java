package com.desafio.itau.dto;

import java.util.ArrayList;
import java.util.List;

import com.desafio.itau.conversor.CondominioSerializer;
import com.desafio.itau.dominio.Apartamento;
import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.dominio.Despesa;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = CondominioSerializer.class)
public class CondominioDTO {
	

	private Integer id;
	private String nome;
	private String email;
	private Integer numeroDeApt;
	private double valorRateio;
	private List<Despesa> despesas = new ArrayList<>();
	private List<Apartamento> apartamentos = new ArrayList<>();
	
	public CondominioDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CondominioDTO(Condominio condominio) {
		this.id = condominio.getId();
		this.nome = condominio.getNome();
		this.email = condominio.getEmail();
		this.setNumeroDeApt(condominio.getNumeroDeApt());
		this.valorRateio = condominio.getValorRateio();
		this.despesas = condominio.getDespesas();
		this.apartamentos = condominio.getApartamentos();
	}
	
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public double getValorRateio() {
		return valorRateio;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public void setValorRateio(double valorRateio) {
		this.valorRateio = valorRateio;
	}

	public List<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(List<Despesa> despesas) {
		this.despesas = despesas;
	}

	public Integer getNumeroDeApt() {
		return numeroDeApt;
	}

	public void setNumeroDeApt(Integer numeroDeApt) {
		this.numeroDeApt = numeroDeApt;
	}

	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}

	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}

}
