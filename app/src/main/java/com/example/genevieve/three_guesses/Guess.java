package com.example.genevieve.three_guesses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Random;


public class Guess extends AppCompatActivity {

    private static final String TAG = "Guess";


    private int numberBoxes = 10; //TODO set up possibility of different number of boxes
    private int treasureNumber = 10000;
    private int logNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Random randomNumGenerator = new Random();
        treasureNumber = randomNumGenerator.nextInt(numberBoxes);
        Log.d(TAG, " treasure number  " + treasureNumber);
        logNo = 1;
        setContentView(R.layout.activity_guess);
    }
    private void checkTreasure(int boxNumber) {
        Log.d(TAG, "guessed: " + boxNumber);
        ImageButton[] buttonArray = {
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
        ImageView yourGuessView = findViewById(R.id.yourColor);
        if (boxNumber != treasureNumber) {
            buttonArray[boxNumber].setImageResource(R.drawable.ic_hole);
            if (treasureNumber == boxNumber + 1 || treasureNumber == boxNumber - 1) {
                yourGuessView.setBackgroundColor(getResources().getColor(R.color.nearColor));
            } else if (treasureNumber == boxNumber + 2 || treasureNumber == boxNumber - 2 || treasureNumber == boxNumber + 3 || treasureNumber == boxNumber - 3){
                yourGuessView.setBackgroundColor(getResources().getColor(R.color.farColor));
            } else {
                yourGuessView.setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
            }
        } else {
            buttonArray[boxNumber].setImageResource(R.drawable.ic_holewithcoins);
            yourGuessView.setImageResource(R.drawable.ic_coinpile_gold);
        }


    }

    public void guessResult(View view){// Get the id of the button clicked
        int butID = view.getId();
        int[] buttonID = {
                R.id.imageB1,
                R.id.imageB2,
                R.id.imageB3,
                R.id.imageB4,
                R.id.imageB5,
                R.id.imageB6,
                R.id.imageB7,
                R.id.imageB8,
                R.id.imageB9,
                R.id.imageBA,
        };
        int buttonNo = 12345;
        for (int bid = 0; bid < 10; bid++){
            if (buttonID[bid] == butID) {
                buttonNo = bid;
            }
        }
        checkTreasure(buttonNo);
        displayHistory(buttonNo);
    }

    private void displayHistory(int buttonNo) {
        ImageView[] historyArray = {
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
        for (int histNo = 0; histNo < numberBoxes; histNo++){
            if (histNo == buttonNo) {
                historyArray[histNo].setBackgroundColor(getResources().getColor(R.color.alreadyGuessedColor));
            } else if(histNo == buttonNo + 1 || histNo == buttonNo - 1) {
                historyArray[histNo].setBackgroundColor(getResources().getColor(R.color.nearColor));
            } else if (histNo == buttonNo + 2 || histNo == buttonNo - 2 ||
                       histNo == buttonNo + 3 || histNo == buttonNo - 3){
                historyArray[histNo].setBackgroundColor(getResources().getColor(R.color.farColor));
            } else {
                historyArray[histNo].setBackgroundColor(getResources().getColor(R.color.outOfRangeColor));
            }
        }
        Toast.makeText(this, "Number of tries " + logNo, Toast.LENGTH_LONG).show();
        logNo++;
        Log.d(TAG, " NEXT GUESS NUMBER " + logNo);
    }

}