package com.example.android.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by zhj930924 on 10/23/2016.
 */

public final class Utils extends AppCompatActivity {

    private Utils() {
    } //Prevent the class from being constructed

    public static void startNewActivity(ImageView targetView, Context
            packageContext, Class<?> targetClass) {

        final Context context = packageContext;
        final Class<?> cls = targetClass;

        // Set a click listener on the target view
        targetView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the target
            // button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new explicit intent to open the target Activity
                Intent intent = new Intent(context, cls);

                // Start the new activity
                context.startActivity(intent);
            }
        });
    }
}

/*
Some things to note about Utility classes:

    - A Utility class should be final, indicating that it cannot be extended.
    - A Utility class should contain a private constructor, indicating that it
    cannot be constructed.
    - A Utility class should only contain final static fields. These fields are
     effectively constants.
    - A Utility class should only contain static methods. Why? Other than
    obvious reasons such as not being required to create an instance of the
    Utility class, a static method causes less overhead because of the fact
    that it is executed at compile-time.
*/