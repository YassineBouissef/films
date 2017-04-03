package com.controller.evaluation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.models.film.Film;
import com.models.user.User;
import com.services.evaluation.EvaluationService;

import dto.EvaluationDTO;

@RestController
@RequestMapping(value = "/evaluation")
public class EvaluationController {
	
	private static final Logger log = LoggerFactory.getLogger(EvaluationController.class);
	
	@Autowired
	private EvaluationService evaluationService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public EvaluationDTO findEvaluationDTOId(@RequestParam(value ="id", required = false)Integer id) {
		log.debug(String.format("Buscando evaluaciones con id %s", id));
		return evaluationService.findEvaluationDTOId(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<EvaluationDTO> findAll(@RequestParam(value ="id", required = false) Integer id, @RequestParam(value ="points", required = false) Integer points, @RequestParam(value ="user", required = false) User user, @RequestParam(value ="film", required = false) Film film) {
		log.debug(String.format("Buscando evaluaciones con id %s, puntuación %s, usuario %s y film %s", id,points,user,film));
		return evaluationService.findAll();
	}
	
	@RequestMapping(method = { RequestMethod.POST })
	public EvaluationDTO create(@RequestBody EvaluationDTO evaluation) {
		log.debug(String.format("Vamos a crear una evaluación de una pelicula: %s", evaluation));
		return evaluationService.create(evaluation);
	}
}
