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
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Get a reference to the TextView
        TextView songName = findViewById(R.id.np_song_name);

        // Creating an Intent class object
        Intent intent = getIntent();

        // Get the data transferred from the previous activity (contain a string with the name of the song, artist and long)
        String data = intent.getStringExtra(Intent.EXTRA_TEXT);

        // Send the string from the previous activity to the specified TextView
        songName.setText(data);

        // Get a references to the ImageButtons
        ImageButton playPause = findViewById(R.id.np_play_pause);

        ImageButton imgButton = findViewById(R.id.np_icon);
        ImageButton imgButton1 = findViewById(R.id.np_rewind);
        ImageButton imgButton2 = findViewById(R.id.np_forward);

        // Set the background for the buttons with the application of shading when you click
        imgButton.getBackground().setColorFilter(getResources().getColor(R.color.colorButton), PorterDuff.Mode.MULTIPLY);
        imgButton1.getBackground().setColorFilter(getResources().getColor(R.color.colorButton), PorterDuff.Mode.MULTIPLY);
        imgButton2.getBackground().setColorFilter(getResources().getColor(R.color.colorButton), PorterDuff.Mode.MULTIPLY);
        playPause.getBackground().setColorFilter(getResources().getColor(R.color.colorButton), PorterDuff.Mode.MULTIPLY);


        // Set a click listener on playPause ImageButton
        playPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton playPause = findViewById(R.id.np_play_pause);
                boolean[] flag = {true};
                // Change the image on the button
                if (flag[0])
                    playPause.setImageResource(R.drawable.baseline_play_circle_outline_white_36);
                else
                    // Return the first picture
                    playPause.setImageResource(R.drawable.baseline_pause_circle_outline_white_36);
                flag[0] = !flag[0];

            }
        });

    }

}
