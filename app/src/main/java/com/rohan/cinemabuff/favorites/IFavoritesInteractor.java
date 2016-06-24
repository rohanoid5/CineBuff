package com.rohan.cinemabuff.favorites;

import com.rohan.cinemabuff.entities.Movie;

import java.util.List;

/**
 * @author arun
 */
public interface IFavoritesInteractor
{
    void setFavorite(Movie movie);
    boolean isFavorite(String id);
    List<Movie> getFavorites();
    void unFavorite(String id);
}
