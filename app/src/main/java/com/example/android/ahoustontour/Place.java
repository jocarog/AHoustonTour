package com.example.android.ahoustontour;


public class Place {

    /**
     * Name of the place
     */
    private String name;

    /**
     * Address of the place
     */
    private String info;

    /**
     * Image resource ID for the place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image is provided for that place
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a constructor.
     *
     * @param name is the name of the place.
     * @param info is the description of the place.
     */
    public Place(String name, String info) {
        this.name = name;
        this.info = info;
    }

    /**
     * Create a a constructor that contain image.
     *
     * @param name            is the name of the place.
     * @param info            is the description of the place
     * @param imageResourceId is the drawable resource ID for the image associated with the Place.
     */
    public Place(String name, String info, int imageResourceId) {
        this.name = name;
        this.info = info;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of that place.
     */
    public String getPlaceName() {
        return this.name;
    }

    /**
     * Get the address of that place.
     */
    public String getInfo() {
        return this.info;
    }


    /**
     * Return the image resource ID of the Place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return whether or not there is an image for that Place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}