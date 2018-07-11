package com.example.android.musicplayerapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaylistAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Playlist} objects.
 */
public class PlaylistAdapter extends ArrayAdapter<Playlist> {

    /**
     * This is my own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context    The current context. Used to inflate the layout file.
     * @param categories A List of Playlist objects to display in a list
     */

    PlaylistAdapter(Activity context, ArrayList<Playlist> categories) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        super(context, R.layout.playlist_item, categories);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Get the {@link Playlist} object located at this position in the list
        Playlist playlist = getItem(position);

        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            assert playlist != null;
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.playlist_item, parent, false);
        }
        // Find the TextView in the playlist_item.xml layout with the ID version_name
        // Get the category name from the current Playlist object and
        // set this text on the name TextView
        if (playlist != null) {
            ((TextView) convertView.findViewById(R.id.pl_song_name))
                    .setText(playlist.getSongName());
        }

        // Return the whole list item layout (containing TextView)
        // so that it can be shown in the ListView
        return convertView;
    }
}
