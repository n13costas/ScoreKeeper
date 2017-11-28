package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Saves the scores of both athletes in case of changing activity
    static final String STATE_SCORE_A = "athleteAScore";
    static final String STATE_SCORE_B = "athleteBScore";

    // Tracks the score for Athlete A
    int scoreAthleteA = 0;

    // Tracks the score for Athlete B
    int scoreAthleteB = 0;

    // Highlights the winner athlete
    String winA = "A is the WINNER";
    String winB = "B is the WINNER";

    //Creates global textviews variables to save performance
    private TextView scoreViewA;
    private TextView scoreViewB;
    private TextView winnerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewA = (TextView) findViewById(R.id.Athlete_a_score_textview);
        scoreViewB = (TextView) findViewById(R.id.Athlete_b_score_textview);
        winnerView = (TextView) findViewById(R.id.winner_textview);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(STATE_SCORE_A, scoreAthleteA);
        savedInstanceState.putInt(STATE_SCORE_B, scoreAthleteB);

        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);


        // Restore state members from saved instance
        scoreAthleteA = savedInstanceState.getInt(STATE_SCORE_A);
        scoreAthleteB = savedInstanceState.getInt(STATE_SCORE_B);
        displayForAthleteA(scoreAthleteA);
        displayForAthleteB(scoreAthleteB);
    }


    /**
     * Ippon: Increase the score for Athlete A by 100 points and the game is over.
     */
    public void ipponForAthleteA(View v) {
        scoreAthleteA = scoreAthleteA + 100;
        displayForAthleteA(scoreAthleteA);
        displayWinForAthlete(winA);
    }

    /**
     * Waza-ari: Increase the score for Athlete A by 10 points.
     */
    public void wazaariForAthleteA(View v) {
        scoreAthleteA = scoreAthleteA + 10;
        displayForAthleteA(scoreAthleteA);
    }

    /**
     * Yuko: Increase the score for Athlete A by 1 point.
     */
    public void yukoForAthleteA(View v) {
        scoreAthleteA = scoreAthleteA + 1;
        displayForAthleteA(scoreAthleteA);
    }

    /**
     * Ippon: Increase the score for Athlete B by 100 points and the game is over.
     */
    public void ipponForAthleteB(View v) {
        scoreAthleteB = scoreAthleteB + 100;
        displayForAthleteB(scoreAthleteB);
        displayWinForAthlete(winB);
    }

    /**
     * Waza-ari: Increase the score for Athlete A by 10 points.
     */
    public void wazaariForAthleteB(View v) {
        scoreAthleteB = scoreAthleteB + 10;
        displayForAthleteB(scoreAthleteB);
    }

    /**
     * Yuko: Increase the score for Athlete A by 1 point.
     */
    public void yukoForAthleteB(View v) {
        scoreAthleteB = scoreAthleteB + 1;
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
        winnerView.setText("");
    }

    /**
     * Displays the given score for Athlete A.
     */
    public void displayForAthleteA(int score) {
        scoreViewA.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Athlete B.
     */
    public void displayForAthleteB(int score) {
        scoreViewB.setText(String.valueOf(score));
    }

    /**
     * Displays the winner of the game.
     */
    public void displayWinForAthlete(String winner) {
        winnerView.setText(String.valueOf(winner));
    }


}
