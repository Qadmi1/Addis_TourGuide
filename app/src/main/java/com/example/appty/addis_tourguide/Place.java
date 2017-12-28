package com.example.appty.addis_tourguide;

/**
 * Created by appty on 25/12/17.
 */

public class Place {

    private int mImageResource;
    private int mName;

    public Place(int mImageResource, int mName) {
        this.mImageResource = mImageResource;
        this.mName = mName;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public int getmName() {
        return mName;
    }
}
