package com.api.movieapi.model;

import java.math.BigInteger;
import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "movie")
public class MovieModel {

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Integer budget;
    private String homepage;
    private String overview;
    private Double popularity;
    private Date release_date;
    private BigInteger revenue;
    private Integer  runtime;
    private String movies_status;
    private String tagline;
    private Double vote_average;
    private Integer vote_count;

}
