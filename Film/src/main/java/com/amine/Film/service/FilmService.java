package com.amine.Film.service;


import java.util.List;

import com.amine.Film.entities.Film;
import com.amine.Film.entities.Genre;

public interface FilmService {
	Film saveFilm(Film f);
	Film updateFilm(Film f);
	void deleteFilm(Film f);
	void deleteFilmById(Long id);
	Film getFilm(Long id);
	List<Film> getAllFilm();
	List<Film> findByNomFilm(String nom);
	List<Film> findByNomFilmContains(String nom);
	List<Film> findByNomRate (String nom, Double rate);
	List<Film> findByGenre (Genre genre);
	List<Film> findByGenreIdGenre(Long id);
	List<Film> findByOrderByNomFilmAsc();
	List<Film> trierFilmNomsRate();


}
