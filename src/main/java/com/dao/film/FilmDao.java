package com.dao.film;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.models.film.Film;

@Repository
public interface FilmDao extends PagingAndSortingRepository <Film,Integer>{
	
	public List<Film> findByYearGreaterThanEqual(Integer year);
	
	public List<Film> findByTitleContaining(String title);

}
