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
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Find the View that shows the search category
        View nowPlaying = findViewById(R.id.nowPlayingLayout);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(SearchActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Create an ArrayList of Category objects

        final ArrayList<Category> searchResults = new ArrayList<>();

        // Get a reference to the GridView, and attach the adapter to the gridView.

        GridView gridView = findViewById(R.id.grid);

        // создаем поле EditText view для реализации поиска пользователем
        final EditText editText = findViewById(R.id.editText);

        final String[] search = getResources().getStringArray(R.array.folders);

        // Create an {@link CategoryAdapter}, whose data source is a list of
        // {@link Category}s. The adapter knows how to create list item views for each item
        // in the list.

        final CategoryAdapter searchAdapter = new CategoryAdapter(this, searchResults);

        gridView.setAdapter(searchAdapter);

        // Set a click listener on that EditText View
        editText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) // The listener perceives the text input by the user
                    if (keyCode == KeyEvent.KEYCODE_ENTER) {
                        String searchResult = editText.getText().toString();// The entered text is converted to a String object
                        for (String item : search) {
                            // The entered text is compared with an array of Strings containing the names of albums, genres and bands
                            if (item.equalsIgnoreCase(searchResult)) {
                                // If the text is the same - puts an Category object with that name in the array
                                searchResults.add(new Category(editText.getText().toString(), R.drawable.default_pic));
                                editText.setText(item);
                                searchAdapter.notifyDataSetChanged();
                                return true;
                            }
                        }
                        return true;
                    }
                return false;
            }
        });

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
                startActivity(new Intent(SearchActivity.this, CurrentPlaylistActivity.class)
                        .putExtra(Intent.EXTRA_TEXT, strText));// Sends the text of the pressed element to the new activity

            }
        });
    }
}
