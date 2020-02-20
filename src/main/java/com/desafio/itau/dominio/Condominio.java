package com.desafio.itau.dominio;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="condominio")
public class Condominio extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private String nome;
	
	@Embedded
	private Endereco endereco;
	
	private String telefone;
	
	private String email;
	
	private Integer numeroDeApt;
	
	
	@OneToMany(mappedBy="condominio")
	private List<Apartamento> apartamentos;
	
	
	@OneToMany(mappedBy="condominio")
	private List<Despesa> despesas;

	public Condominio() {
	}

	public Condominio(String nome, Endereco endereco, String telefone, String email, Integer numeroDeApt) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.numeroDeApt = numeroDeApt;
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}

	public List<Despesa> getDespesas() {
		return despesas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
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
	
	public double getValorRateio() {
		double despesaTotal = 0.0;
		for (Despesa d : getDespesas()) {
			despesaTotal += d.getValorDespesa();
		}
		return despesaTotal/getNumeroDeApt();
	}
}
