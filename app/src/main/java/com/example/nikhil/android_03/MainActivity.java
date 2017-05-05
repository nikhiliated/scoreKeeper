package com.example.nikhil.android_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
                                           }

    public void plus3(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        int scoreA= Integer.parseInt(scoreView.getText().toString());
        scoreA= scoreA + 3;
        displayForTeamA(scoreA);
                                 }

    public void plus2(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        int scoreA= Integer.parseInt(scoreView.getText().toString());
        scoreA= scoreA + 2;
        displayForTeamA(scoreA);
                                 }

    public void freeThrow(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        int scoreA= Integer.parseInt(scoreView.getText().toString());
        scoreA= scoreA + 1;
        displayForTeamA(scoreA);
                                     }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus3B(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        int scoreB= Integer.parseInt(scoreView.getText().toString());
        scoreB= scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void plus2B(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        int scoreB= Integer.parseInt(scoreView.getText().toString());
        scoreB= scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void freeThrowB(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        int scoreB= Integer.parseInt(scoreView.getText().toString());
        scoreB= scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void reset(View view) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        int scoreA= Integer.parseInt(scoreView.getText().toString());
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        int scoreB= Integer.parseInt(scoreViewB.getText().toString());
        scoreA= 0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }
}
