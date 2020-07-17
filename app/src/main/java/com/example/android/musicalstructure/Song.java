package com.example.android.musicalstructure;

import android.support.annotation.IdRes;

/**
 * Custom list item class
 */
public class Song {
    private String name;
    private String artist;
    private int imageId;

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getImageId() {
        return imageId;
    }

    public Song(String name, String artist, int imageId) {
        this.name = name;
        this.artist = artist;
        this.imageId = imageId;
    }
}
