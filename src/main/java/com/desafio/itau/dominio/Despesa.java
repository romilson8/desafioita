package com.desafio.itau.dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Despesa extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "despesa")
	private List<TipoDespesa> tipo;

	private Date data;

	@ManyToOne
	private Condominio condominio;

	public Despesa() {

	}

	public Despesa(List<TipoDespesa> tipo, Date data) {
		this.tipo = tipo;
		this.data = data;
	}

	public List<TipoDespesa> getTipo() {
		return tipo;
	}

	public void setTipo(List<TipoDespesa> tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		double valor = 0.0;
		for (TipoDespesa tipoDespesa : tipo) {
			valor = +tipoDespesa.getValorDespesa();
		}
		return valor;
	}

}
