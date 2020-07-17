package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_search.xml
        // layout file
        setContentView(R.layout.activity_search);

        // Start MainActivity when the Home button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.home_button_search),
                SearchActivity.this,
                MainActivity.class);

        // Start FavoriteActivity when the Favorite button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.favorite_button_search),
                SearchActivity.this,
                FavoriteActivity.class);

        // Start ProfileActivity when the Profile button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.profile_button_search),
                SearchActivity.this,
                ProfileActivity.class);
    }
}