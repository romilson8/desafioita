package com.desafio.itau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.itau.dominio.Apartamento;
import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.dominio.Despesa;
import com.desafio.itau.dominio.Endereco;
import com.desafio.itau.dominio.Proprietario;
import com.desafio.itau.repository.CondominioRepository;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner{
	
	@Autowired
	private CondominioRepository condominioRepository;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Endereco endereco = new Endereco("Rua Viriato Correia", "71", "51030510", "Boa Viagem", "Recife", "PE");
		
		Despesa desp = new Despesa(tipo, data)
		Proprietario prop = new Proprietario(nome, telefone, cpf, email, endereco, apartamentos)
		Apartamento apartamentos = new Apartamento("80", prop);
		
		Condominio condominio = new Condominio("Montreal", endereco, "96759966", "zero.barros@gmail.com", apartamentos, despesas)
		
	}
	
	
}
