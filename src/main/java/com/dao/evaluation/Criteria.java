package com.dao.evaluation;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hsqldb.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import com.models.evaluation.Evaluation;

import dto.EvaluationDTO;

public class Criteria implements EvaluationCriteria {
	
	/*
	//Get [Evaluation(Todos)]
	public List<EvaluationDTO> findByInteger(Integer id) {		
		
		Criteria criteria = session.createCriteria(Evaluation.class);		
		
		List<EvaluationDTO> evaluations = criteria.list();
		for(EvaluationDTO eval : evaluations){
			System.out.println("ID="+eval.getId()+", Points="+eval.getPoints()+", User="+eval.getUserDTO().getId()+" Film="+eval.getFilmDTO().getTitle());
		}	
		
	}*/

	
	
	
}
