package com.services.evaluation;

import com.models.evaluation.Evaluation;

import dto.EvaluationDTO;

public interface EvaluationService {

	

	EvaluationDTO findEvaluationDTOId(Integer id);

	EvaluationDTO create(EvaluationDTO evaluation);
	
	EvaluationDTO transform(Evaluation evaluation);

	Evaluation transform(EvaluationDTO evaluationDTO);

}
