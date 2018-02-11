package com.example.android.miwok;

/**
 * Created by kienphan on 1/24/18.
 * {@link Word} represents a vocabulary word that the user wants to lern.
 * It contains a default translation and a miwok translation for that word.
 */

public class Word {

    //default translation for the word
    private String mDefaultTranslation;

    //miwok translation for the word
    private String mMiwokTranslation;

    //image id of the translation
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceID;

    /**
     * constructor for views with image and audio
     * @param defaultTranslation the default translation
     * @param miwokTranslation the miwok translation
     * @param imageResourceID the id for the image file
     * @param audioResourceID the id for the audio file
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    /**
     * constructor for views with audio
     * @param defaultTranslation the default translation
     * @param miwokTranslation the miwok translation
     * @param audioResourceID the id for the audio file
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    //get the image resourceID
    public int getmImageResourceID() { return mImageResourceID; }

    // get default translation of word
    public String getDefaultTranslate() {
        return mDefaultTranslation;
    }

    // get miwok translation of word
    public String getMiwokTranslate() {
        return mMiwokTranslation;
    }

    //check if word has image
    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    // returns the mAudioResourceID so that the listener from numberActivities and phraseAct... know what audio to play
    public int getmAudioResourceID() {
        return mAudioResourceID;
    }
}
