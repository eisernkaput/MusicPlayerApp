package com.example.android.musicplayerapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CurrentPlaylistActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_playlist);

        // Find the View that shows the search category
        View nowPlaying = findViewById(R.id.nowPlayingLayout);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(CurrentPlaylistActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        Intent intent = getIntent();

        String data = intent.getStringExtra(Intent.EXTRA_TEXT);

        ArrayList<Playlist> playlist = new ArrayList<>();


        if (data.equalsIgnoreCase("Turbo")) {
            final String[]search = getResources().getStringArray(R.array.turbo);
            for (String item: search) {
                playlist.add(new Playlist(item));
                }


        } else if (data.equalsIgnoreCase("Ram It Down")) {
            final String[]search = getResources().getStringArray(R.array.ram_it_down);
            for (String item: search) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("Firepower")) {
            final String[]search = getResources().getStringArray(R.array.firepower);
            for (String item: search) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("Master of Puppets")) {
            final String[]search = getResources().getStringArray(R.array.master_of_puppets);
            for (String item: search) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("…And Justice for All")) {
            final String[]search = getResources().getStringArray(R.array.and_justice_for_all);
            for (String item: search) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("St. Anger")) {
            final String[]search = getResources().getStringArray(R.array.st__anger);
            for (String item: search) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("Toxicity")) {
            final String[]search = getResources().getStringArray(R.array.toxicity);
            for (String item: search) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("Mezmerize")) {
            final String[]search = getResources().getStringArray(R.array.mezmerize);
            for (String item: search) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("Hypnotize")) {
            final String[]search = getResources().getStringArray(R.array.hypnotize);
            for (String item: search) {
                playlist.add(new Playlist(item));

            }         } else if (data.equalsIgnoreCase("Judas Priest")) {
            final String[]search = getResources().getStringArray(R.array.ram_it_down);
            final String[]search1 = getResources().getStringArray(R.array.turbo);
            final String[]search2 = getResources().getStringArray(R.array.firepower);

            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }
            for (String item: search2) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("Metallica")) {
            final String[]search = getResources().getStringArray(R.array.master_of_puppets );
            final String[]search1 = getResources().getStringArray(R.array.and_justice_for_all);
            final String[]search2 = getResources().getStringArray(R.array.st__anger);

            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }
            for (String item: search2) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("System of a Down")) {
            final String[]search = getResources().getStringArray(R.array.toxicity);
            final String[]search1 = getResources().getStringArray(R.array.mezmerize);
            final String[]search2 = getResources().getStringArray(R.array.hypnotize);

            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }
            for (String item: search2) {
                playlist.add(new Playlist(item));
            }
        } else if (data.equalsIgnoreCase("Trash metal")) {
            final String[]search = getResources().getStringArray(R.array.master_of_puppets );
            final String[]search1 = getResources().getStringArray(R.array.and_justice_for_all);
            final String[]search2 = getResources().getStringArray(R.array.st__anger);

            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }
            for (String item: search2) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("Heavy metal")) {
            final String[]search = getResources().getStringArray(R.array.master_of_puppets );
            final String[]search1 = getResources().getStringArray(R.array.and_justice_for_all);
            final String[]search2 = getResources().getStringArray(R.array.st__anger);
            final String[]search3 = getResources().getStringArray(R.array.ram_it_down);
            final String[]search4 = getResources().getStringArray(R.array.turbo);
            final String[]search5 = getResources().getStringArray(R.array.firepower);


            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }
            for (String item: search2) {
                playlist.add(new Playlist(item));
            }

            for (String item: search3) {
                playlist.add(new Playlist(item));
            }
            for (String item: search4) {
                playlist.add(new Playlist(item));
            }
            for (String item: search5) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("Alternative metal")) {
            final String[]search = getResources().getStringArray(R.array.toxicity);
            final String[]search1 = getResources().getStringArray(R.array.mezmerize);
            final String[]search2 = getResources().getStringArray(R.array.hypnotize);

            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }
            for (String item: search2) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("Nu metal")) {
            final String[]search = getResources().getStringArray(R.array.toxicity);
            final String[]search1 = getResources().getStringArray(R.array.mezmerize);
            final String[]search2 = getResources().getStringArray(R.array.hypnotize);

            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }
            for (String item: search2) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("Hard rock")) {
            final String[]search = getResources().getStringArray(R.array.toxicity);
            final String[]search1 = getResources().getStringArray(R.array.mezmerize);
            final String[]search2 = getResources().getStringArray(R.array.hypnotize);
            final String[]search3 = getResources().getStringArray(R.array.ram_it_down);
            final String[]search4 = getResources().getStringArray(R.array.turbo);
            final String[]search5 = getResources().getStringArray(R.array.firepower);


            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }
            for (String item: search2) {
                playlist.add(new Playlist(item));
            }

            for (String item: search3) {
                playlist.add(new Playlist(item));
            }
            for (String item: search4) {
                playlist.add(new Playlist(item));
            }
            for (String item: search5) {
                playlist.add(new Playlist(item));
            }
        } else if (data.equalsIgnoreCase("playlist1")) {
            final String[]search = getResources().getStringArray(R.array.toxicity);
            final String[]search1 = getResources().getStringArray(R.array.and_justice_for_all);

            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("morning")) {
            final String[]search = getResources().getStringArray(R.array.turbo);
            final String[]search1 = getResources().getStringArray(R.array.master_of_puppets);
            final String[]search2 = getResources().getStringArray(R.array.hypnotize);


            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }
            for (String item: search2) {
                playlist.add(new Playlist(item));
            }

        } else if (data.equalsIgnoreCase("training")) {
            final String[]search = getResources().getStringArray(R.array.ram_it_down);
            final String[]search1 = getResources().getStringArray(R.array.toxicity);
            final String[]search2 = getResources().getStringArray(R.array.firepower);
            final String[]search3 = getResources().getStringArray(R.array.st__anger);

            for (String item: search) {
                playlist.add(new Playlist(item));
            }
            for (String item: search1) {
                playlist.add(new Playlist(item));
            }
            for (String item: search2) {
                playlist.add(new Playlist(item));
            }

            for (String item: search3) {
                playlist.add(new Playlist(item));
            }

        }


        PlaylistAdapter playlistAdapter = new PlaylistAdapter(this, playlist);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(playlistAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                TextView textView = itemClicked.findViewById(R.id.pl_song_name);

                String strText = textView.getText().toString(); // получаем текст нажатого элемента

                startActivity(new Intent(CurrentPlaylistActivity.this, NowPlayingActivity.class)
                        .putExtra(Intent.EXTRA_TEXT, strText));

            }
        });
    }
}
