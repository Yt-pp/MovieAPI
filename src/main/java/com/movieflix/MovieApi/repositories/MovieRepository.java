package com.movieflix.MovieApi.repositories;

import com.movieflix.MovieApi.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
