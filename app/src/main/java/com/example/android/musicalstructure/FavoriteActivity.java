package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_favorite.xml
        // layout file
        setContentView(R.layout.activity_favorite);

        // Start SearchActivity when the Search button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.search_button_favorite),
                FavoriteActivity.this,
                SearchActivity.class);

        // Start MainActivity when the Home button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.home_button_favorite),
                FavoriteActivity.this,
                MainActivity.class);

        // Start ProfileActivity when the Profile button is clicked
        Utils.startNewActivity(
                (ImageView) findViewById(R.id.profile_button_favorite),
                FavoriteActivity.this,
                ProfileActivity.class);

        // Populate list view
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Heathens", "Twenty One Pilots", R.drawable.heathens));
        songs.add(new Song("Baby Shark", "Pinkfong", R.drawable.baby_shark));
        songs.add(new Song("Old Town Road", "Lil Nas X",
                R.drawable.old_town_road));
        songs.add(new Song("Sunflower", "Post Malone & Swae Lee", R.drawable.sunflower));
        songs.add(new Song("Without Me", "Halsey", R.drawable.without_me));
        songs.add(new Song("Sicko Mode", "Travis Scott", R.drawable.sicko_mode));
        songs.add(new Song("Bad Guy", "Billie Eilish", R.drawable.bad_guy));
        songs.add(new Song("Wow.", "Post Malone", R.drawable.wow));
        songs.add(new Song("Happier", "Marshmello & Bastille", R.drawable.happier));
        songs.add(new Song("Thank U, Next", "Ariana Grande", R.drawable.thank_u_next));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}