package hu.nagy.kristof.a2days2work;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Map;

public class HighscoreActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    private static final String preferenceName = "highscores";
    Map<String,?> scores;
    ScrollView scoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);
        scoreView = (ScrollView)findViewById(R.id.scoresView);
        sharedPreferences = getSharedPreferences(preferenceName, Context.MODE_PRIVATE);

        scores = sharedPreferences.getAll();

        for(Map.Entry<String, ?> score: scores.entrySet()){
            final TextView scoreRow = new TextView(this);
            scoreRow.setText("Név: " + score.getKey() + " Pontszám: " + score.getValue());
            scoreView.addView(scoreRow);
        }
    }
}