package com.rohan.cinemabuff.sorting;

import com.rohan.cinemabuff.entities.SortType;

/**
 * @author arun
 */
public class SortingDialogInteractor implements ISortingDialogInteractor
{
    private SortingOptionStore mSortingOptionStore;

    public SortingDialogInteractor()
    {
        mSortingOptionStore = new SortingOptionStore();
    }

    @Override
    public int getSelectedSortingOption()
    {
        return mSortingOptionStore.getSelectedOption();
    }

    @Override
    public void setSortingOption(SortType sortType)
    {
        mSortingOptionStore.setSelectedOption(sortType);
    }
}
