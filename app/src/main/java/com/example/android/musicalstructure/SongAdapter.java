package com.example.android.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(@NonNull Context context, @NonNull List<Song> songs) {
        // resource id is 0 as we don't rely on superclass
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentSong = getItem(position);

        // Find and set song name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        nameTextView.setText(currentSong.getName());

        // Find and set artist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.song_artist);
        artistTextView.setText(currentSong.getArtist());

        // Find and set song icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.song_icon);
        iconView.setImageResource(currentSong.getImageId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
