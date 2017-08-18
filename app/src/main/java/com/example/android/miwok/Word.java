package com.example.android.miwok;

/**
 * Created by graphics on 5/12/17.
 */

public class Word {

    /** Default translation for the word */
    private int mImagesResourceId;

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Images resource ID for the words */
    private String mMiwokTranslation;

    /** Audio resource ID for the words */
    private int mAudioResourceId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imagesResourceId is the images resource id
     * @param audioResourceId is the audio resource id
     */

    public Word(String defaultTranslation, String miwokTranslation, int imagesResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imagesResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceId is the audio resource id
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get Images resource ID for the words
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get Audio resource ID for the words
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
