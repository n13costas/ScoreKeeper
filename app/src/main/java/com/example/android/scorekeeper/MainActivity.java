package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // Tracks the score for Athlete A
    int scoreAthleteA = 0;

    // Tracks the score for Athlete B
    int scoreAthleteB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Athlete A by 1 point.
     */
    public void addOneForAthleteA(View v) {
        scoreAthleteA = scoreAthleteA + 1;
        displayForAthleteA(scoreAthleteA);
    }

    /**
     * Increase the score for Athlete A by 2 points.
     */
    public void addTwoForAthleteA(View v) {
        scoreAthleteA = scoreAthleteA + 2;
        displayForAthleteA(scoreAthleteA);
    }

    /**
     * Increase the score for Athlete A by 3 points.
     */
    public void addThreeForAthleteA(View v) {
        scoreAthleteA = scoreAthleteA + 3;
        displayForAthleteA(scoreAthleteA);
    }

    /**
     * Increase the score for Athlete B by 1 point.
     */
    public void addOneForAthleteB(View v) {
        scoreAthleteB = scoreAthleteB + 1;
        displayForAthleteB(scoreAthleteB);
    }

    /**
     * Increase the score for Athlete B by 2 points.
     */
    public void addTwoForAthleteB(View v) {
        scoreAthleteB = scoreAthleteB + 2;
        displayForAthleteB(scoreAthleteB);
    }

    /**
     * Increase the score for Athlete B by 3 points.
     */
    public void addThreeForAthleteB(View v) {
        scoreAthleteB = scoreAthleteB + 3;
        displayForAthleteB(scoreAthleteB);
    }

    /**
     * Resets the score for both Athletes back to 0.
     */
    public void resetScore(View v) {
        scoreAthleteA = 0;
        scoreAthleteB = 0;
        displayForAthleteA(scoreAthleteA);
        displayForAthleteB(scoreAthleteB);
    }

    /**
     * Displays the given score for Athlete A.
     */
    public void displayForAthleteA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Athlete_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Athlete B.
     */
    public void displayForAthleteB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Athlete_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
