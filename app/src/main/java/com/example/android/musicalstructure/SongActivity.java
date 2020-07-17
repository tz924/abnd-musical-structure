package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_song.xml
        // layout file
        setContentView(R.layout.activity_song);

        // Start MainActivity when the Home button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.home_button_song),
                SongActivity.this,
                MainActivity.class);
    }
}