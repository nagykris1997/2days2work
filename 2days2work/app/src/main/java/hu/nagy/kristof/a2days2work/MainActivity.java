package hu.nagy.kristof.a2days2work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button playButton;
    public EditText playerName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) findViewById(R.id.playButton);
        playerName = (EditText) findViewById(R.id.playerName);

        final Intent intent = new Intent(this, SecondActivity.class);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(playerName.getText().toString())){
                    Toast.makeText(MainActivity.this,"Add meg a nevedet amivel játszanál",Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(intent);
                }

            }
        });

    }
}
