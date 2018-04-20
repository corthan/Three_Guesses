package com.example.genevieve.three_guesses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstGuess(View view){// Get the intent that starts next activity
            Intent guessIntent = new Intent(this, Guess.class);
            startActivity(guessIntent);
    }
}
