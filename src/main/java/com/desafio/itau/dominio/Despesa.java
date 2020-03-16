package com.desafio.itau.dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Despesa extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private String nomeDespesa;

	private double valorDespesa;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date data;

	@JsonIgnore
	@ManyToOne
	private Condominio condominio;

	public Despesa() {

	}

	public Despesa(String nomeDespesa, double valorDespesa, Date data, Condominio condominio) {
		super();
		this.nomeDespesa = nomeDespesa;
		this.valorDespesa = valorDespesa;
		this.data = data;
		this.condominio = condominio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNomeDespesa() {
		return nomeDespesa;
	}

	public double getValorDespesa() {
		return valorDespesa;
	}

	public Date getData() {
		return data;
	}

	public Condominio getCondominio() {
		return condominio;
	}

	public void setNomeDespesa(String nomeDespesa) {
		this.nomeDespesa = nomeDespesa;
	}

	public void setValorDespesa(double valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
	}

//	public double getValorTotal() {
//		double valor = 0.0;
//		for (TipoDespesa tipoDespesa : tipo) {
//			valor = +tipoDespesa.getValorDespesa();
//		}
//		return valor;
//	}

}
