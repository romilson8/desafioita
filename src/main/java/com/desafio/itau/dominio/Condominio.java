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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
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

	@JsonIgnore
	@OneToMany(mappedBy = "condominio")
	private List<Apartamento> apartamentos;

	@JsonIgnore
	@OneToMany(mappedBy = "condominio")
	private List<Despesa> despesas;

}
