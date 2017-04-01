package com.services.evaluation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.dozer.DozerBeanMapper;

import com.dao.evaluation.EvaluationDao;
import com.models.evaluation.Evaluation;

import dto.EvaluationDTO;

@Service
public class EvaluationServiceImpl  implements EvaluationService{

	@Autowired 
	private EvaluationDao evaluationDao;
	
	//@Autowired 
	//private DozerBeanMapper dozer;
	
	public EvaluationDTO findEvaluationDTOId(Integer id){
		return transform(findEvaluationById(id));
	}
	
	private Evaluation findEvaluationById(Integer id) {
		final Evaluation evaluation = evaluationDao.findOne(id);
		return evaluation;
	}
	

	
	public EvaluationDTO create(EvaluationDTO evaluationDTO) {
		final Evaluation evaluation = transform(evaluationDTO);
		return transform(evaluationDao.save(evaluation));
	}
	
	
	public EvaluationDTO transform(Evaluation evaluation) {
		final EvaluationDTO evaluationDTO = new EvaluationDTO(evaluation.getId(),evaluation.getPoints(),evaluation.getUser(),evaluation.getFilm());
		return evaluationDTO;
	}

	
	public Evaluation transform(EvaluationDTO evaluationDTO) {
		final Evaluation evaluation = new Evaluation();
		evaluation.setId(evaluationDTO.getId());
		evaluation.setPoints(evaluationDTO.getPoints());
		evaluation.setUser(evaluationDTO.getUser());
		evaluation.setFilm(evaluationDTO.getFilm());
		
		return evaluation;
	}
}
