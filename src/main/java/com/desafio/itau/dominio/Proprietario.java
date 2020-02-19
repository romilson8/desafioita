package com.desafio.itau.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Proprietario extends AbstractEntity{
	private static final long serialVersionUID = 1L;

	private String nome;
	private String telefone;
	private String cpf;
	private String email;
	
	@Embedded
	private Endereco endereco;
	
	@JsonIgnore
	@OneToMany(mappedBy="proprietario")
	private List<Apartamento> apartamentos =  new ArrayList<>();

	public Proprietario() {
	}

	public Proprietario(String nome, String telefone, String cpf, String email, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}

	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}
}
