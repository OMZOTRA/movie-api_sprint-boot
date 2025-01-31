package com.api.movieapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.movieapi.model.MovieModel;
import com.api.movieapi.repository.MovieRepository;
import com.api.movieapi.service.MovieDao;

@Service
public class MovieService implements MovieDao {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Iterable<MovieModel> getAllMovie() {
        return movieRepository.findAll();
    }
}
