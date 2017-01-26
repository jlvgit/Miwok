package com.example.android.miwok;

/**
 * Created by JLV on 10/16/2016.
 */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;
    private int mSoundResourceId;


    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId){
        mMiwokTranslation   = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mSoundResourceId = soundResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId){
        mMiwokTranslation   = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    public String getMiwokTranslation(){return mMiwokTranslation;}

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public int getSoundResourceId() { return mSoundResourceId; }
}
