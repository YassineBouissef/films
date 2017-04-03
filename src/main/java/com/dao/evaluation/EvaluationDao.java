package com.dao.evaluation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.models.evaluation.Evaluation;

@Repository
public interface EvaluationDao extends PagingAndSortingRepository<Evaluation, Integer> , EvaluationCriteria{	
	
	

}
