package com.api.movieapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.movieapi.model.MovieModel;

@RestController
@RequestMapping("/")
public class MovieService {

    @Autowired
    private MovieService movieService;

    @GetMapping("movies")
    public Iterable<MovieModel> getMovie(){
        return movieService.getMovie();
    }
}
