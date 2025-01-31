package com.api.movieapi.service;

import java.util.List;

import com.api.movieapi.model.MovieModel;

public interface MovieDao {

    Iterable<MovieModel> getAllMovie();
}
