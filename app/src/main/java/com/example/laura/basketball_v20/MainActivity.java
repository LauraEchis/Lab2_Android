package com.example.laura.basketball_v20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView team1count;
    TextView team2count;
    TextView three_point_team1;
    TextView two_point_team1;
    TextView foul_shot_team1;
    TextView three_point_team2;
    TextView two_point_team2;
    TextView foul_shot_team2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team1count = (TextView) findViewById(R.id.team1count);
        team2count = (TextView) findViewById(R.id.team2count);
        three_point_team1 = (TextView) findViewById(R.id.three_point_team1);
        two_point_team1 = (TextView) findViewById(R.id.two_point_team1);
        foul_shot_team1 = (TextView) findViewById(R.id.foul_shot_team1);
        three_point_team2 = (TextView) findViewById(R.id.three_point_team2);
        two_point_team2 = (TextView) findViewById(R.id.two_point_team2);
        foul_shot_team2 = (TextView) findViewById(R.id.foul_shot_team2);
        clear_all();
    }

    public void btn_clear_onClick(View view) {
        clear_all();
    }

    public void clear_all(){
        team1count.setText("0");
        team2count.setText("0");
        three_point_team1.setText("0");
        two_point_team1.setText("0");
        foul_shot_team1.setText("0");
        three_point_team2.setText("0");
        two_point_team2.setText("0");
        foul_shot_team2.setText("0");
    }

    public void update_score(TextView textView_wholescore, TextView textView_score, int count) {

        int all_score = Integer.parseInt((textView_wholescore.getText().toString()));
        all_score = all_score+count;
        textView_wholescore.setText(Integer.toString(all_score));
        int shot_score = Integer.parseInt((textView_score.getText().toString()));
        shot_score++;
        textView_score.setText(Integer.toString(shot_score));
    }

    public void btn_1p_team1_onClick(View view) {
        update_score(team1count, foul_shot_team1, 1);
    }

    public void btn_2p_team1_onClick(View view) {
        update_score(team1count, two_point_team1, 2);
    }

    public void btn_3p_team1_onClick(View view) {
        update_score(team1count, three_point_team1, 3);
    }

    public void btn_1p_team2_onClick(View view) {
        update_score(team2count, foul_shot_team2, 1);
    }

    public void btn_2p_team2_onClick(View view) {
        update_score(team2count, two_point_team2, 2);
    }

    public void btn_3p_team2_onClick(View view) {
        update_score(team2count, three_point_team2, 3);
    }
}
