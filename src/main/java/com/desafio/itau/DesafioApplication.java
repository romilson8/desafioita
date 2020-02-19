package com.desafio.itau;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.itau.dominio.Apartamento;
import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.dominio.Despesa;
import com.desafio.itau.dominio.Endereco;
import com.desafio.itau.dominio.Proprietario;
import com.desafio.itau.repository.ApartamentoRepository;
import com.desafio.itau.repository.CondominioRepository;
import com.desafio.itau.repository.DespesaRepository;
import com.desafio.itau.repository.ProprietarioRepository;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private CondominioRepository condominioRepository;
	
	@Autowired
	private ProprietarioRepository proprietarioRepository;
	
	@Autowired
	private ApartamentoRepository apartamentoRepository;

	@Autowired
	private DespesaRepository despesaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Endereco endereco = new Endereco("Rua Viriato Correia", "71", "51030510", "Boa Viagem", "Recife", "PE");
//		
//		Proprietario prop = new Proprietario("Jose Barros", "94985566", "04044364478", "zero.barros@gmail.com",
//				endereco);
//		proprietarioRepository.save(prop);
//
//		Condominio condominio1 = new Condominio("Montreal", endereco, "96759966", "zero.barros@gmail.com", 80);
//		condominioRepository.save(condominio1);
//		Apartamento apartamentos = new Apartamento("803", prop, condominio1);
//		apartamentoRepository.save(apartamentos);
//		
//
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	
//		Despesa desp = new Despesa("Gas", 15000.00, sdf.parse("30/09/2017"), condominio1);
//		despesaRepository.save(desp);
//		Despesa desp2 = new Despesa("Telefone", 3000.00, sdf.parse("19/02/2020"), condominio1);
//		despesaRepository.save(desp2);
//	}
	
	

}
