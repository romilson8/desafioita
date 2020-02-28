package com.desafio.itau.repository.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.desafio.itau.dominio.Condominio;

public class CondominioSpecification implements Specification<Condominio>{

	private static final long serialVersionUID = 1L;

	@Override
	public Predicate toPredicate(Root<Condominio> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

}
