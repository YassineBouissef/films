package com.dao.evaluation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.websocket.Session;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties.Hibernate;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.jayway.jsonpath.Criteria;
import com.models.evaluation.Evaluation;

import dto.EvaluationDTO;

@Repository
public interface EvaluationDao extends PagingAndSortingRepository<Evaluation, Integer>{

	
	
	/*
	public static List<EvaluationDTO> findByInteger(Integer id) {		
		//Get All Evaluation
		
		Session session = Hibernate.getHibernateSession();
		Criteria criteria = session.createCriteria(Evaluation.class);
		List<EvaluationDTO> evaluatios = criteria.list();
		for(EvaluationDTO eval : evaluatios){
			System.out.println("ID="+eval.getId()+", Points="+eval.getPoints()+", User="+eval.getUser().getName()+" Film="+eval.getFilm().getTitle());
		}	 
	}*/
}
