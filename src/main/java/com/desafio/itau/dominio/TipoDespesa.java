package com.desafio.itau.dominio;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class TipoDespesa extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private String nomeDespesa;
	
	private Double valorDespesa;

	@ManyToOne
	private Despesa despesa;

	public TipoDespesa() {

	}

	public TipoDespesa(String nomeDespesa, Double valorDespesa) {
		super();
		this.nomeDespesa = nomeDespesa;
		this.valorDespesa = valorDespesa;
	}

	public String getNomeDespesa() {
		return nomeDespesa;
	}

	public Double getValorDespesa() {
		return valorDespesa;
	}

	public void setNomeDespesa(String nomeDespesa) {
		this.nomeDespesa = nomeDespesa;
	}

	public void setValorDespesa(Double valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

}
