package com.services.film;

import java.util.List;

import com.models.film.Film;

import dto.FilmDTO;

public interface FilmService {
	
	FilmDTO transform(Film f);
	
	Film transform(FilmDTO f);
	
	public List<FilmDTO> findAll();
	
	public FilmDTO findFilmById(Integer id);
	
	public FilmDTO create(FilmDTO f);
	
	public void delete(Integer id);
	
	public FilmDTO update(Integer id, FilmDTO f);

}
