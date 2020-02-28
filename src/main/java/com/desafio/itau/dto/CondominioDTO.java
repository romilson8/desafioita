package com.desafio.itau.dto;

import java.util.List;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.dominio.Despesa;
import com.desafio.itau.dominio.Proprietario;

public class CondominioDTO {
	
	private Integer id;
	private String nome;
	private String email;
	private Integer numeroDeApt;
	private double valorRateio;
	private List<Despesa> despesas;
	private List<ProprietarioDTO> proprietario;
	
//	public CondominioDTO() {
//	}
//
//	public CondominioDTO(Condominio condominio) {
//		id = condominio.getId();
//		nome = condominio.getNome();
//		email = condominio.getEmail();
//		numeroDeApt = condominio.getNumeroDeApt();
//		valorRateio = condominio.getValorRateio();
//	}

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
		return numeroDeApt;
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
		this.numeroDeApt = numeroApartamentos;
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

	public List<ProprietarioDTO> getProprietario() {
		return proprietario;
	}

	public void setProprietario(List<ProprietarioDTO> proprietario) {
		this.proprietario = proprietario;
	}

}
