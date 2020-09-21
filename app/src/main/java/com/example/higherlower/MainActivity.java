package com.example.higherlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string) {

        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();

    }

    public void userGuess(View view) {

        EditText editTextGuess = findViewById(R.id.editTextGuess);

        int guessInt = Integer.parseInt(editTextGuess.getText().toString());

        if (guessInt > randomNumber) {

            makeToast("lower!");

        } else if (guessInt < randomNumber) {

            makeToast("higher!");

        } else {

            // the following line can be replaced by the makeToast method.

            Toast.makeText(this, "Correcto! Uno mas?", Toast.LENGTH_SHORT).show();

            Random rand = new Random();

            randomNumber = rand.nextInt(20) + 1;

        }



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;

    }
}