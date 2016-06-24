package com.rohan.cinemabuff.details;

import com.rohan.cinemabuff.entities.Review;
import com.rohan.cinemabuff.entities.Video;

import java.util.List;

import rx.Observable;

/**
 * @author arun
 */
public interface IMovieDetailsInteractor
{
    Observable<List<Video>> getTrailers(String id);
    Observable<List<Review>> getReviews(String id);
}
