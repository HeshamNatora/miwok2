package com.example.android.miwok;

import android.media.Image;
import android.media.MediaPlayer;

public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private  int mMediaPlayerResourceId;

    public Word(String miwokTranslation, String defaultTranslation, int mediaPlayerResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMediaPlayerResourceId = mediaPlayerResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int mediaPlayerResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mMediaPlayerResourceId = mediaPlayerResourceId;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public int getmMediaPlayerResourceId() {return mMediaPlayerResourceId;}


}
