package com.rohan.cinemabuff.sorting;

import com.rohan.cinemabuff.entities.SortType;

/**
 * @author arun
 */
public interface ISortingDialogInteractor
{
    int getSelectedSortingOption();

    void setSortingOption(SortType sortType);
}
