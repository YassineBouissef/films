package com.services.evaluation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.evaluation.EvaluationDao;
import com.models.evaluation.Evaluation;

import dto.EvaluationDTO;

@Service
public class EvaluationServiceImpl  implements EvaluationService{

	@Autowired 
	private EvaluationDao evaluationDao;	
	
	/******************** BUSCAR(Id) DEVUELVE(Todos)**************************/

	public EvaluationDTO findEvaluationAll(Integer id){
		final Iterable<Evaluation> findAll = evaluationDao.findAll();
		final List<EvaluationDTO> evaluation = new ArrayList<>();
		findAll.forEach(b -> {
			final EvaluationDTO eval = transform(b);
			evaluation.add(eval);
		});
		return (EvaluationDTO) evaluation;
	}
		
	/******************** BUSCAR(Id) **************************/

	@Override
	public EvaluationDTO findEvaluationDTOId(Integer id){
		return transform(findEvaluationById(id));
	}
	
	private Evaluation findEvaluationById(Integer id) {
		final Evaluation evaluation = evaluationDao.findOne(id);
		return evaluation;
	}
	
	/******************** BUSCAR(Todos) **************************/

	@Override
	public List<EvaluationDTO> findAll() {
		final Iterable<Evaluation> evaluations = evaluationDao.findAll();
		final List<EvaluationDTO> evaluationsDTO = new ArrayList<EvaluationDTO>();
		evaluations.forEach(u -> {evaluationsDTO.add(transform(u)); });
		return evaluationsDTO;
	}
	
	/********************** CREAR *****************************/

	public EvaluationDTO create(EvaluationDTO evaluationDTO) {
		final Evaluation evaluation = transform(evaluationDTO);
		return transform(evaluationDao.save(evaluation));
	}
	
	/********************** TRASNFORMAR *****************************/
	
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
