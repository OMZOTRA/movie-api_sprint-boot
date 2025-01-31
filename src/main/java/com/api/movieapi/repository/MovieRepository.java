package com.api.movieapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.movieapi.model.MovieModel;

@Repository
public interface MovieRepository extends CrudRepository<MovieModel,Long> {
}
