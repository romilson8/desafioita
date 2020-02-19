package com.desafio.itau.dominio;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="apartamento")
public class Apartamento extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private String numero;
	
	@ManyToOne
	private Proprietario proprietario;
	
	@ManyToOne
	private Condominio condominio;

	public Apartamento() {
	}

	public Apartamento(String numero, Proprietario proprietario, Condominio condominio) {
		super();
		this.numero = numero;
		this.proprietario = proprietario;
		this.condominio = condominio;
	}

	public String getNumero() {
		return numero;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Condominio getCondominio() {
		return condominio;
	}

	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
	}

}
