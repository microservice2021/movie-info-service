package com.mi.tech.movieinfoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mi.tech.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInformationController {
	
	@GetMapping("/{movieId}")
	public Movie getMovieInfoById(@PathVariable("movieId") String movieId) {
		
		return new Movie("100", "Dil","Amir Khans movie");
	}

}
