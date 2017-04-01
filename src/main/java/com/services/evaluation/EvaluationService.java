package com.services.evaluation;

import com.models.evaluation.Evaluation;

import dto.EvaluationDTO;

public interface EvaluationService {

	EvaluationDTO transform(Evaluation evaluation);

	Evaluation transform(EvaluationDTO evaluationDTO);

	EvaluationDTO findEvaluationDTOId(Integer id);

	EvaluationDTO create(EvaluationDTO evaluation);

}
