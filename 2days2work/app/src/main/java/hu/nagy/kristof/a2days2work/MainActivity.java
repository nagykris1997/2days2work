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

    public Button nextButton;
    public TextView udvText;
    public EditText nevadas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextButton = (Button) findViewById(R.id.tovabbButton);
        udvText = (TextView) findViewById(R.id.welcomeText);
        nevadas = (EditText) findViewById(R.id.nevmegadoText);

        final Intent intent = new Intent(this, SecondActivity.class);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(nevadas.getText().toString())){
                    Toast.makeText(MainActivity.this,"Add meg a nevedet amivel játszanál",Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(intent);
                }

            }
        });

    }
}
