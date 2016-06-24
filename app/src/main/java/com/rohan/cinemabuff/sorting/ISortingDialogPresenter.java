package com.rohan.cinemabuff.sorting;

/**
 * @author arun
 */
public interface ISortingDialogPresenter
{
    void setLastSavedOption();

    void onPopularMoviesSelected();

    void onHighestRatedMoviesSelected();

    void onFavoritesSelected();
}
