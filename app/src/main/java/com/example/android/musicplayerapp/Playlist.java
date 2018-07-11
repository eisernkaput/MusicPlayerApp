package com.example.android.musicplayerapp;

/**
 * {@link Playlist} represents a single Element containing text (song name,artist and song length)
 * Each object has 1 propertie: name.
 */
public class Playlist {

    // Name of the song and additional info
    private String songName;

    /**
     * Create a new Category object.
     *
     * @param vsongName is the name of the Playlist
     */
    Playlist(String vsongName) {
        this.songName = vsongName;

    }

    /**
     * Get the name of the Playlist
     */
    public String getSongName() {
        return songName;
    }
}
