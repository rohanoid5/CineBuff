package com.rohan.cinemabuff.listing;

import com.rohan.cinemabuff.entities.Movie;

import java.util.List;

/**
 * @author arun
 */
public interface IMoviesListingView
{
    void showMovies(List<Movie> movies);
    void loadingStarted();
    void loadingFailed(String errorMessage);
    void onMovieClicked(Movie movie);
}
