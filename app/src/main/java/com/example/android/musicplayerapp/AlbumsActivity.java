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
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Find the View that shows the search category
        View nowPlaying = findViewById(R.id.nowPlayingLayout);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(AlbumsActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Create an ArrayList of Category objects

        ArrayList<Category> albums = new ArrayList<>();

        String[] albumsArr = getResources().getStringArray(R.array.albums);

        albums.add(new Category(albumsArr[0], R.drawable.turbo));
        albums.add(new Category(albumsArr[1], R.drawable.ram_it_down));
        albums.add(new Category(albumsArr[2], R.drawable.firepower));
        albums.add(new Category(albumsArr[3], R.drawable.master_of_puppets));
        albums.add(new Category(albumsArr[4], R.drawable.and_justice_for_all));
        albums.add(new Category(albumsArr[5], R.drawable.st_anger));
        albums.add(new Category(albumsArr[6], R.drawable.toxicity));
        albums.add(new Category(albumsArr[7], R.drawable.mezmerize));
        albums.add(new Category(albumsArr[8], R.drawable.hypnotize));

        // Create an {@link CategoryAdapter}, whose data source is a list of
        // {@link Category}s. The adapter knows how to create list item views for each item
        // in the list.

        CategoryAdapter albumsAdapter = new CategoryAdapter(this, albums);

        // Get a reference to the GridView, and attach the adapter to the gridView.

        GridView gridView = findViewById(R.id.grid);

        gridView.setAdapter(albumsAdapter);

        // Set a click listener on that GridView

        gridView.setOnItemClickListener(new GridView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                // Find the View that shows the search category
                TextView textView = itemClicked.findViewById(R.id.song_name);

                // Get the text of the pressed element
                String strText = textView.getText().toString();

                // Create a new intent to open the {@link CurrentPlaylistActivity}
                startActivity(new Intent(AlbumsActivity.this, CurrentPlaylistActivity.class)
                        .putExtra(Intent.EXTRA_TEXT, strText));// Sends the text of the pressed element to the new activity

            }
        });

    }

}
