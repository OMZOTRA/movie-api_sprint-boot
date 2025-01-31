package com.api.movieapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.movieapi.model.MovieModel;
import com.api.movieapi.service.impl.MovieService;

@RestController
@RequestMapping("/")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("movies")
    public Iterable<MovieModel> getMovie(){
        return movieService.getAllMovie();
    }
}
