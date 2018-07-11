/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the search category
        View nowPlaying = findViewById(R.id.nowPlayingLayout);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });


        // Find the View that shows the search category
        TextView search = findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the albums category
        TextView albums = findViewById(R.id.albums);

        // Adds to the category name the number of elements that will be selected in the next activity.

        String[] alb = getResources().getStringArray(R.array.albums);

        String albumsLen = getResources().getText(R.string.category_albums) + " \n" + Integer.toString(alb.length);

        albums.setText(albumsLen);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the artists category
        TextView artists = findViewById(R.id.artists);

        // Adds to the category name the number of elements that will be selected in the next activity.

        String[] art = getResources().getStringArray(R.array.artists);

        String artistsLen = getResources().getText(R.string.category_artists) + " \n" + Integer.toString(art.length);

        artists.setText(artistsLen);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the genres category
        TextView genres = findViewById(R.id.genres);

        // Adds to the category name the number of elements that will be selected in the next activity.

        String[] genr = getResources().getStringArray(R.array.genres);

        String genresLen = getResources().getText(R.string.category_genres) + " \n" + Integer.toString(genr.length);

        genres.setText(genresLen);

        // Set a click listener on that View
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genres category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenresActivity}
                Intent genresIntent = new Intent(MainActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(genresIntent);
            }
        });

        // Find the View that shows the playlists category
        TextView playlists = findViewById(R.id.playlists);

        // Adds to the category name the number of elements that will be selected in the next activity.

        String[] playl = getResources().getStringArray(R.array.playlists);

        String playlistsLen = getResources().getText(R.string.category_playlists) + " \n" + Integer.toString(playl.length);

        playlists.setText(playlistsLen);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistsActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the folders category
        TextView folders = findViewById(R.id.folders);

        // Adds to the category name the number of elements that will be selected in the next activity.

        String[] fold = getResources().getStringArray(R.array.artists);

        String foldersLen = getResources().getText(R.string.category_folders) + " \n" + Integer.toString(fold.length);

        folders.setText(foldersLen);


        // Set a click listener on that View
        folders.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the folders category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoldersActivity}
                Intent foldersIntent = new Intent(MainActivity.this, FoldersActivity.class);

                // Start the new activity
                startActivity(foldersIntent);
            }
        });
    }

}
