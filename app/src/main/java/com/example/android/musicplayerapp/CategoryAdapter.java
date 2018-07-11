package com.example.android.musicplayerapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link CategoryAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Category} objects.
 */
public class CategoryAdapter extends ArrayAdapter<Category> {

    /**
     * This is my own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context    The current context. Used to inflate the layout file.
     * @param categories A List of Category objects to display in a list
     */

    CategoryAdapter(Activity context, ArrayList<Category> categories) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        super(context, R.layout.category_item, categories);
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

        // Get the {@link Category} object located at this position in the list
        Category category = getItem(position);

        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            assert category != null;
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.category_item, parent, false);
        }
        // Find the ImageView in the category_item.xml layout with the ID list_item_icon
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to ImageView
        if (category != null) {
            ((ImageView) convertView.findViewById(R.id.icon_category)).
                    setImageResource(category.getImgResourceId());
        }


        // Find the TextView in the category_item.xml layout with the ID version_name
        // Get the category name from the current Category object and
        // set this text on the name TextView
        if (category != null) {
            ((TextView) convertView.findViewById(R.id.song_name))
                    .setText(category.getCategoryName());
        }
        // Return the whole list item layout (containing TextView and an ImageView)
        // so that it can be shown in the GridView
        return convertView;
    }
}
