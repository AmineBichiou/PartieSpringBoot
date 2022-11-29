package com.amine.Film.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amine.Film.entities.Genre;
import com.amine.Film.repos.GenreRepository;

@RestController
@RequestMapping("/api/gen")
@CrossOrigin("*")
public class GenreRESTController {
	@Autowired
	GenreRepository genreRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Genre> getAllGenre()
	{
	return genreRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Genre getGenreByIdGenre(@PathVariable("id") Long id) {
	return genreRepository.findById(id).get();
	}


}
