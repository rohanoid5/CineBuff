package com.rohan.cinemabuff.listing;

import rx.Subscription;

/**
 * @author arun
 */
public interface IMoviesListingPresenter
{
    Subscription displayMovies();
}
