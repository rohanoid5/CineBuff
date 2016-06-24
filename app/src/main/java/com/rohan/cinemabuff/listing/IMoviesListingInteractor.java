package com.rohan.cinemabuff.listing;

import com.rohan.cinemabuff.entities.Movie;

import java.util.List;

import rx.Observable;

/**
 * @author arun
 */
public interface IMoviesListingInteractor
{
    Observable<List<Movie>> fetchMovies();
}
