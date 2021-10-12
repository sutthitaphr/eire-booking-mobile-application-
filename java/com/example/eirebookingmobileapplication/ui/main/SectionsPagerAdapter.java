package com.example.eirebookingmobileapplication.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.eirebookingmobileapplication.AccomFragments.AirBnbFragment;
import com.example.eirebookingmobileapplication.AccomFragments.HostelFragment;
import com.example.eirebookingmobileapplication.AccomFragments.HotelFragment;
import com.example.eirebookingmobileapplication.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_1, R.string.tab_2, R.string.tab_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment acc_fragment = null;
        switch (position){
            case 0:
                acc_fragment = new HotelFragment();
                break;
            case 1:
                acc_fragment = new AirBnbFragment();
                break;
            case 2:
                acc_fragment = new HostelFragment();
                break;
        }
        return acc_fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}