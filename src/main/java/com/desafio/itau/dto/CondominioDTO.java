package com.desafio.itau.dto;

import com.desafio.itau.dominio.Condominio;

public class CondominioDTO {
	
	private Integer id;
	private String nome;
	private String email;
	private Integer numeroApartamentos;
	private double valorRateio;
	
	public CondominioDTO() {
	}

	public CondominioDTO(Condominio condominio) {
		id = condominio.getId();
		nome = condominio.getNome();
		email = condominio.getEmail();
		numeroApartamentos = condominio.getNumeroDeApt();
		valorRateio = condominio.getValorRateio();
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

	public Integer getNumeroApartamentos() {
		return numeroApartamentos;
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

	public void setNumeroApartamentos(Integer numeroApartamentos) {
		this.numeroApartamentos = numeroApartamentos;
	}

	public void setValorRateio(double valorRateio) {
		this.valorRateio = valorRateio;
	}

}
