package com.services.film;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.film.FilmDao;
import com.models.film.Film;

import dto.FilmDTO;

public class FilmServiceImpl implements FilmService{
	
	@Autowired
	private FilmDao filmDao;
	
	@Override
	public FilmDTO transform(Film f) {
		return new FilmDTO(f.getTitle(),f.getYear());
	}

	@Override
	public Film transform(FilmDTO f) {
		final Film film=new Film();
		film.setTitle(f.getTitle());
		film.setYear(f.getYear());
		return film;
	}

	@Override
	public List<FilmDTO> findAll() {
		List<FilmDTO> allF= new ArrayList<FilmDTO>();
		filmDao.findAll().forEach(f -> allF.add(transform(f)));
		return allF;
	}

	@Override
	public FilmDTO findFilmById(Integer id) {
		final Film f=filmDao.findOne(id);
		return transform((f!=null)? f : new Film());
	}

	@Override
	public FilmDTO create(FilmDTO f) {
		return transform(filmDao.save(transform(f)));
	}

	@Override
	public void delete(Integer id) {
		filmDao.delete(id);
	}

	@Override
	public FilmDTO update(Integer id, FilmDTO f) {
		final Film film= transform(f);
		film.setId(id);
		return transform(filmDao.save(film));
	}

}
