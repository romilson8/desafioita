package com.desafio.itau.repository.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class CondominioFilter {

	private String email;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate mesAno;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ano;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getMesAno() {
		return mesAno;
	}

	public void setMesAno(LocalDate mesAno) {
		this.mesAno = mesAno;
	}

	public LocalDate getAno() {
		return ano;
	}

	public void setAno(LocalDate ano) {
		this.ano = ano;
	}
	

}
