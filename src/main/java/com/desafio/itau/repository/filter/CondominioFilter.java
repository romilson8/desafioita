package com.desafio.itau.repository.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class CondominioFilter {

	private String proprietario;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate mesAno;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ano;
	
	public String getProprietario() {
		return proprietario;
	}
	public LocalDate getMesAno() {
		return mesAno;
	}
	public LocalDate getAno() {
		return ano;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public void setMesAno(LocalDate mesAno) {
		this.mesAno = mesAno;
	}
	public void setAno(LocalDate ano) {
		this.ano = ano;
	}

}
