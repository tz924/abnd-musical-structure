package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml
        // layout file
        setContentView(R.layout.activity_main);

        // Start SearchActivity when the Search button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.search_button_main),
                MainActivity.this,
                SearchActivity.class);

        // Start FavoriteActivity when the Favorite button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.favorite_button_main),
                MainActivity.this,
                FavoriteActivity.class);

        // Start ProfileActivity when the Profile button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.profile_button_main),
                MainActivity.this,
                ProfileActivity.class);

        // Populate sample
        // Find and set sample song name
        TextView nameTextView = (TextView) findViewById(R.id.song_name_main);
        nameTextView.setText(R.string.sample_song_name);

        // Find and set sample artist
        TextView artistTextView = (TextView) findViewById(R.id.song_artist_main);
        artistTextView.setText(R.string.sample_song_artist);

        // Find and set sample icon
        ImageView iconView = (ImageView) findViewById(R.id.song_icon_main);
        iconView.setImageResource(R.drawable.heathens);

        // Start SongActivity when the Play button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.play_main),
                MainActivity.this,
                SongActivity.class);
    }
}
