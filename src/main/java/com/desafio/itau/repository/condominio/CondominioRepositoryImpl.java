package com.desafio.itau.repository.condominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.repository.filter.CondominioFilter;

public class CondominioRepositoryImpl implements CondominioRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<Condominio> filtrar(CondominioFilter condominioFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Condominio> criteria = builder.createQuery(Condominio.class);
		Root<Condominio> root = criteria.from(Condominio.class);

		// criar restrições
		Predicate[] predicates = criarRestricoes(condominioFilter, builder, root);
		criteria.where(predicates);

		TypedQuery<Condominio> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, total(condominioFilter));
	}

	private Predicate[] criarRestricoes(CondominioFilter condominioFilter, CriteriaBuilder builder,
			Root<Condominio> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (!StringUtils.isEmpty(condominioFilter.getEmail())) {
			predicates.add(builder.like(builder.lower(root.get("email")),
					"%" + condominioFilter.getEmail().toLowerCase() + "%"));
		}
		if (condominioFilter.getAno() != null) {
			predicates.add(builder.greaterThanOrEqualTo(root.get("dataVencimento"), condominioFilter.getAno()));

		}
		if (condominioFilter.getMesAno() != null) {
			predicates.add(builder.greaterThanOrEqualTo(root.get("dataVencimento"), condominioFilter.getMesAno()));

		}
		if (condominioFilter.getId() != null) {
			predicates.add(builder.greaterThanOrEqualTo(root.get("id"), condominioFilter.getId()));

		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long total(CondominioFilter condominioFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Condominio> root = criteria.from(Condominio.class);

		Predicate[] predicates = criarRestricoes(condominioFilter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrospagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrospagina;
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrospagina);
	}

}
