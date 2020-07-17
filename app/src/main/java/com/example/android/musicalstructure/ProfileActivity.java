package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_profile.xml
        // layout file
        setContentView(R.layout.activity_profile);

        // Start SearchActivity when the Search button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.search_button_profile),
                ProfileActivity.this,
                SearchActivity.class);

        // Start FavoriteActivity when the Favorite button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.favorite_button_profile),
                ProfileActivity.this,
                FavoriteActivity.class);

        // Start MainActivity when the Home button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.home_button_profile),
                ProfileActivity.this,
                MainActivity.class);
    }
}