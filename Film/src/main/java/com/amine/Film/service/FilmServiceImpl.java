package com.amine.Film.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amine.Film.entities.Film;
import com.amine.Film.entities.Genre;
import com.amine.Film.repos.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService{
	
	@Autowired
	FilmRepository FilmRepository;
	@Override
	public Film saveFilm(Film f) {
		
		return FilmRepository.save(f);
	}

	@Override
	public Film updateFilm(Film f) {
		return FilmRepository.save(f);
	}

	@Override
	public void deleteFilm(Film f) {
		FilmRepository.delete(f);
		
	}

	@Override
	public void deleteFilmById(Long id) {
		FilmRepository.deleteById(id);
		
	}

	@Override
	public Film getFilm(Long id) {
		return FilmRepository.findById(id).get();
	}

	@Override
	public List<Film> getAllFilm() {
		return FilmRepository.findAll();
	}

	@Override
	public List<Film> findByNomFilm(String nom) {
		return FilmRepository.findByNomFilm(nom);
	}

	@Override
	public List<Film> findByNomFilmContains(String nom) {
		return FilmRepository.findByNomFilmContains(nom);
	}

	@Override
	public List<Film> findByNomRate(String nom, Double rate) {
		return FilmRepository.findByNomRate(nom,rate);
	}

	@Override
	public List<Film> findByGenre(Genre Genre) {
		return FilmRepository.findByGenre(Genre);
	}

	@Override
	public List<Film> findByGenreIdGenre(Long id) {
		return FilmRepository.findByGenreIdGenre(id);
	}

	@Override
	public List<Film> findByOrderByNomFilmAsc() {
		return FilmRepository.findByOrderByNomFilmAsc();
	}

	@Override
	public List<Film> trierFilmNomsRate() {
		return FilmRepository.trierFilmNomsRate();
	}
	

}
