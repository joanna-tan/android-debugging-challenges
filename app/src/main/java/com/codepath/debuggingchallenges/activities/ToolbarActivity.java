package com.codepath.debuggingchallenges.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;
//import android.widget.Toolbar;

import androidx.appcompat.widget.Toolbar;


import com.codepath.debuggingchallenges.R;

public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = this.findViewById(R.id.toolbar);
        Log.i("toolbarz", "messed up here");

        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
                //setActionBar(toolbar); doesn't work for this import

        TextView tvDescription = findViewById(R.id.tvDescription);
        tvDescription.setText(R.string.hello);
    }
}
