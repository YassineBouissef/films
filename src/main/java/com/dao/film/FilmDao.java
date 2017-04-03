package com.dao.film;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.models.film.Film;

public interface FilmDao extends PagingAndSortingRepository <Film,Integer>{
	
	public List<Film> findByYearGreaterThanEqual(Integer year);
	
	public List<Film> findByTitleContaining(String title);

}
