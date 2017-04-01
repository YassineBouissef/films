package com.controller.evaluation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.models.evaluation.Evaluation;
import com.services.evaluation.EvaluationService;

import dto.EvaluationDTO;

@RestController
@RequestMapping(value = "/evaluation")
public class EvaluationController {
	
	private static final Logger log = LoggerFactory.getLogger(EvaluationController.class);

	
	@Autowired
	private EvaluationService evaluationService;
	
	/*
	@RequestMapping(method = RequestMethod.GET)
	public Evaluation findAll(){
		return new Evaluation();
	}*/
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public EvaluationDTO findOne(@PathVariable("id") Integer id) {
		log.debug(String.format("Buscando evaluaciones con id %s", id));
		return evaluationService.findEvaluationDTOId(id);
	}
	
	@RequestMapping(method = { RequestMethod.POST })
	public EvaluationDTO create(@RequestBody EvaluationDTO evaluation) {
		log.debug(String.format("Vamos a crear una evaluacion de una pelicula: %s", evaluation));
		return evaluationService.create(evaluation);
	}
}
