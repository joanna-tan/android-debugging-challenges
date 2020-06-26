package com.codepath.debuggingchallenges.activities;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.codepath.debuggingchallenges.R;

public class MainActivity extends AppCompatActivity {

    private Class klass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.i("MainActivity", "got here");

    }

    private void launchActivity(Class klass) {
        this.klass = klass;
        Intent intent = new Intent(this, klass);
        startActivity(intent);
    }

    public void launchCurrentDayActivity(View view) {
        //fixed current day to return as a String
        launchActivity(CurrentDayActivity.class);
    }

    public void launchMoviesActivity(View view) {
        //created a layout manager for the recycler view, initialized list of movies
        //fixed url to API and to title path
        //set getItemCount to movies.size()
        // ? set the adapter as a final variable because it changed to null in line 61
        // added a line to set the default to white --> check why some are green?
        launchActivity(MoviesActivity.class);
    }

    public void launchChangeBackgroundActivity(View view) {
        //fixed the Go button to be clickable, removed android:clickable from the view
        launchActivity(ChangeBackgroundActivity.class);
    }

    public void launchToolbarActivity(View view) {
        //changed Toolbar import to be androidx, and switched setActionBar to setSupportActionBar
        launchActivity(ToolbarActivity.class);
    }
}
