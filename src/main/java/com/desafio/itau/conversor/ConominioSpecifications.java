package com.desafio.itau.conversor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.dominio.Apartamento;

import org.springframework.util.StringUtils;

public class ConominioSpecifications {
	
	private static final String PROPRIETARIO = "proprietario";
	
	public static Specification<Condominio> filters(final Long codigo, final String orderByType, final String orderByName) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            Join<Condominio, Apartamento> joinProprietario = root.join(PROPRIETARIO);
            if(codigo != null) {
                predicates.add(criteriaBuilder.equal(root.get("codigoVersaoVeiculo"), codigo));
            }
            if (!StringUtils.isEmpty(orderByName)) {
                if (orderByType.equals("desc")) {
                    query.orderBy(criteriaBuilder.desc(root.get(orderByName)));
                } else {
                    query.orderBy(criteriaBuilder.asc(root.get(orderByName)));
                }
            }
            
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        };
    }
}
