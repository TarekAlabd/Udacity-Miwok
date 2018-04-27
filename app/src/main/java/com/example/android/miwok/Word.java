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

    /**
     * Constructs a new TextView for initial values for miwokTranslation and defaultTranslation
     */
    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
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
}
