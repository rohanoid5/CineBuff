package com.rohan.cinemabuff.details;

import com.rohan.cinemabuff.entities.Movie;
import com.rohan.cinemabuff.entities.Review;
import com.rohan.cinemabuff.entities.Video;

import java.util.List;

/**
 * @author arun
 */
public interface IMovieDetailsView
{
    void showDetails(Movie movie);
    void showTrailers(List<Video> trailers);
    void showReviews(List<Review> reviews);
    void showFavorited();
    void showUnFavorited();
}
