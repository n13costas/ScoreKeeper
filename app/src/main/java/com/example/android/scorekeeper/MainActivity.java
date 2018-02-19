package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // Tracks the score for Athlete A
    int scoreAthleteA = 0;

    // Tracks the score for Athlete B
    int scoreAthleteB = 0;

    String winA = "A is the WINNER";

    String winB = "B is the WINNER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Ippon: Increases the score for Athlete A by 100 points and the game is over.
     */
    public void ipponForAthleteA(View v) {
        scoreAthleteA = scoreAthleteA + 100;
        displayForAthleteA(scoreAthleteA);
        displayWinForAthlete(winA);
    }

    /**
     * Waza-ari: Increases the score for Athlete A by 10 points.
     */
    public void wazaariForAthleteA(View v) {
        scoreAthleteA = scoreAthleteA + 10;
        displayForAthleteA(scoreAthleteA);
    }

    /**
     * Yuko: Increases the score for Athlete A by 1 point.
     */
    public void yukoForAthleteA(View v) {
        scoreAthleteA = scoreAthleteA + 1;
        displayForAthleteA(scoreAthleteA);
    }

    /**
     * Ippon: Increases the score for Athlete B by 100 points and the game is over.
     */
    public void ipponForAthleteB(View v) {
        scoreAthleteB = scoreAthleteB + 100;
        displayForAthleteB(scoreAthleteB);
        displayWinForAthlete(winB);
    }

    /**
     * Waza-ari: Increases the score for Athlete A by 10 points.
     */
    public void wazaariForAthleteB(View v) {
        scoreAthleteB = scoreAthleteB + 10;
        displayForAthleteB(scoreAthleteB);
    }

    /**
     * Yuko: Increases the score for Athlete A by 1 point.
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
        TextView winnerView = findViewById(R.id.winner_textview);
        winnerView.setText("");
    }

    /**
     * Displays the given score for Athlete A.
     */
    public void displayForAthleteA(int score) {
        TextView scoreView = findViewById(R.id.Athlete_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Athlete B.
     */
    public void displayForAthleteB(int score) {
        TextView scoreView = findViewById(R.id.Athlete_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the winner of the game.
     */
    public void displayWinForAthlete(String winner) {
        TextView winnerView = findViewById(R.id.winner_textview);
        winnerView.setText(String.valueOf(winner));
    }


}
