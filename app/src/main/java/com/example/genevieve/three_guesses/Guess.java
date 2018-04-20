package com.example.genevieve.three_guesses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;


public class Guess extends AppCompatActivity {

    private static final String TAG = "Guess";

    private void doStuff(int b) {
        Log.d(TAG, "onCreate: " + b);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
        Random randomNumGenerator = new Random();
        final int numberBoxes = 10; //TODO set up possibility of different number of boxes
        final int treasureNumber = randomNumGenerator.nextInt(numberBoxes);
        int guess = Log.d("Guess", " " + treasureNumber);

        final ImageButton[] buttonArray = {
                findViewById(R.id.imageB1),
                findViewById(R.id.imageB2),
                findViewById(R.id.imageB3),
                findViewById(R.id.imageB4),
                findViewById(R.id.imageB5),
                findViewById(R.id.imageB6),
                findViewById(R.id.imageB7),
                findViewById(R.id.imageB8),
                findViewById(R.id.imageB9),
                findViewById(R.id.imageBA),
    };
        final ImageView[] historyArray = {
                findViewById(R.id.historyView0),
                findViewById(R.id.historyView1),
                findViewById(R.id.historyView2),
                findViewById(R.id.historyView3),
                findViewById(R.id.historyView4),
                findViewById(R.id.historyView5),
                findViewById(R.id.historyView6),
                findViewById(R.id.historyView7),
                findViewById(R.id.historyView8),
                findViewById(R.id.historyView9),
        };


        final ImageView yourGuessView = findViewById(R.id.yourColor);
        buttonArray[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int boxNumber = 0;
                doStuff(boxNumber);
                if (boxNumber != treasureNumber) {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
                    historyArray[boxNumber].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
                    historyArray[boxNumber + 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber + 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber + 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
                    } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
                    } else {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
                    }
                } else {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    historyArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    yourGuessView.setImageResource(R.drawable.ic_coin_gold);
                }
            }
        });
        buttonArray[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int boxNumber = 1;
                if (boxNumber != treasureNumber) {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
                    historyArray[boxNumber].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
                    historyArray[boxNumber + 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber - 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber + 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber + 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
                    } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
                    } else {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
                    }

                } else {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    historyArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    yourGuessView.setImageResource(R.drawable.ic_coin_gold);
                }
            }
        });
        buttonArray[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int boxNumber = 2;
                if (boxNumber != treasureNumber) {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
                    historyArray[boxNumber].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
                    historyArray[boxNumber + 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber - 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber + 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber + 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
                    } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
                    } else {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
                    }
                } else {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    historyArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    yourGuessView.setImageResource(R.drawable.ic_coin_gold);
                }
            }
        });
        buttonArray[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int boxNumber = 3;
                if (boxNumber != treasureNumber) {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
                    historyArray[boxNumber].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
                    historyArray[boxNumber + 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber - 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber + 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber + 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
                    } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
                    } else {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
                    }
                } else {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    historyArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    yourGuessView.setImageResource(R.drawable.ic_coin_gold);
                }
            }
        });
        buttonArray[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int boxNumber = 4;
                if (boxNumber != treasureNumber) {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
                    historyArray[boxNumber].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
                    historyArray[boxNumber + 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber - 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber + 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber + 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
                    } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
                    } else {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
                    }
                } else {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    historyArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    yourGuessView.setImageResource(R.drawable.ic_coin_gold);
                }
            }
        });
        buttonArray[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int boxNumber = 5;
                if (boxNumber != treasureNumber) {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
                    historyArray[boxNumber].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
                    historyArray[boxNumber + 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber - 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber + 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber + 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
                    } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
                    } else {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
                    }
                } else {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    historyArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    yourGuessView.setImageResource(R.drawable.ic_coin_gold);
                }

            }
        });
        buttonArray[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int boxNumber = 6;
                if (boxNumber != treasureNumber) {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
                    historyArray[boxNumber].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
                    historyArray[boxNumber + 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber - 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber + 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber + 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
                    } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
                    } else {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
                    }
                } else {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    historyArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    yourGuessView.setImageResource(R.drawable.ic_coin_gold);
                }

            }
        });
        buttonArray[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int boxNumber = 7;
                if (boxNumber != treasureNumber) {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
                    historyArray[boxNumber].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
                    historyArray[boxNumber + 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber - 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber + 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
                    } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
                    } else {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
                    }
                } else {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    historyArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    yourGuessView.setImageResource(R.drawable.ic_coin_gold);
                }

            }
        });
        buttonArray[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int boxNumber = 8;
                if (boxNumber != treasureNumber) {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
                    historyArray[boxNumber].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
                    historyArray[boxNumber + 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber - 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber - 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
                    } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
                    } else {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
                    }
                } else {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    historyArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    yourGuessView.setImageResource(R.drawable.ic_coin_gold);
                }

            }
        });
        buttonArray[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int boxNumber = 9;
                if (boxNumber != treasureNumber) {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
                    historyArray[boxNumber].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
                    historyArray[boxNumber - 1].setBackgroundColor(getResources().getColor(R.color.nearColor));
                    historyArray[boxNumber - 2].setBackgroundColor(getResources().getColor(R.color.farColor));
                    historyArray[boxNumber - 3].setBackgroundColor(getResources().getColor(R.color.farColor));
                    if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
                    } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
                    } else {
                        yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
                    }
                } else {
                    buttonArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    historyArray[boxNumber].setImageResource(R.drawable.ic_coin_gold);
                    yourGuessView.setImageResource(R.drawable.ic_coin_gold);
                }

            }
        });



  //      public void firstGuessResult(View view){// Get the intent that starts next activity
  //          Intent guessResultIntent = new Intent(this, GuessResult.class);
  //          startActivity(guessResultIntent);
   //     }
    }
}