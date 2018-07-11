package com.example.android.musicplayerapp;

/**
 * {@link Category} represents a single Element containing text (album, group, genre, etc.) and album art
 * Each object has 2 properties: name, and image resource ID.
 */

public class Category {
    // Name of the Category
    private String categoryName;
    // Drawable resource ID
    private int imgResourceId;

    /**
     * Create a new Category object.
     *
     * @param vcategoryName  is the name of the Category
     * @param vimgResourceId is drawable reference ID that corresponds to the Category
     */
    Category(String vcategoryName, int vimgResourceId) {
        this.categoryName = vcategoryName;
        this.imgResourceId = vimgResourceId;
    }

    /**
     * Get the name of the Category
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Get the image resource ID
     */
    public int getImgResourceId() {
        return imgResourceId;
    }

}
