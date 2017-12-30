package com.example.appty.addis_tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by appty on 26/12/17.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LandMarks_Fragment();
        }
        return new LandMarks_Fragment();
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 1;
    }
}