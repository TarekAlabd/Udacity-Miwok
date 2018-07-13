package com.example.android.miwok;

import android.content.Context;

/**
 * {@link Word} represents the vocabulary word that the user wants to learn
 * it contains a default translation and a miwok translation for that word
 */
public class Word {
    //String value for miwok
    private String mMiwokTranslation;

    //String value for default
    private String mDefaultTranslation;

    //Image Resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = -1;

    //Audio Resource ID for the word
    private int mAudioResourceId;


    /**
     * Constructs a new TextView for initial values for miwokTranslation and defaultTranslation.
     *
     * @param defaultTranslation : English Translation.
     *
     * @param miwokTranslation : Miwok
     */
    public Word (String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Constructs a new TextView for initial values for miwokTranslation and defaultTranslation.
     *
     * @param defaultTranslation : English Translation.
     *
     * @param miwokTranslation : Miwok
     *
     * @param imageResourceId : Image
     */
    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Gets the String value in the TextView
     *
     *@return current text in the TextView
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Gets the String value in the TextView
     *
     *@return current text in the TextView
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Gets the int value in the TextView
     *
     *@return current text in the TextView
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Gets the int value in the TextView
     *
     *@return current text in the TextView
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
