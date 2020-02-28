package com.desafio.itau.dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "condominio")
public class Condominio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	@Embedded
	private Endereco endereco;

	private String telefone;

	private String email;

	private Integer numeroDeApt;

	@OneToMany(mappedBy = "condominio")
	private List<Apartamento> apartamentos;

	@OneToMany(mappedBy = "condominio")
	private List<Despesa> despesas;

	public Condominio() {
	}

	public Condominio(Integer id, String nome, Endereco endereco, String telefone, String email, Integer numeroDeApt) {
		super();
		this.setId(id);
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.setNumeroDeApt(numeroDeApt);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return despesaTotal / getNumeroDeApt();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Condominio other = (Condominio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
