package com.services.evaluation;

import java.util.List;

import com.models.evaluation.Evaluation;
import dto.EvaluationDTO;

public interface EvaluationService {
	
	/* 
	 * Buscar evaluacionesDTO por id
	 * 
	 * @param id
	 * @return
	 */
	EvaluationDTO findEvaluationDTOId(Integer id);
	
	/* Dar de alta un nuevo usuario en el sistema
	 * 
	 * @param id
	 * @return
	 */
	EvaluationDTO create(EvaluationDTO evaluation);

	/* Buscar todas las evaluaciones que hay en el sistema
	 * 
	 * 
	 * @param evaluationDTO
	 * @return 
	 */
	List<EvaluationDTO> findAll();
	
	/* 
	 * Transformar un evaluacionDTO en evaluación
	 * 
	 * @param evaluation
	 * @return
	 */
	EvaluationDTO transform(Evaluation evaluation);
	
	/* 
	 * Transformar una evaluación en evaluationDTO
	 * 
	 * @param evaluationDTO
	 * @return 
	 */
	Evaluation transform(EvaluationDTO evaluationDTO);


	
}
