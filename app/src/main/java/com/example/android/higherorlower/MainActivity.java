package com.example.android.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int n;
    int guessedNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // wrap it into a method and call it   public int numberGenerator ()

        Random random = new Random();

        n = random.nextInt(20) + 1;

    }

    public void guess(View view) {

        EditText et = (EditText) findViewById(R.id.editText);
        // int
        guessedNum = Integer.parseInt(et.getText().toString());

        if (guessedNum > n) {

            makeToast("Lower");


        } else if (guessedNum < n) {

            makeToast("Higher");

        } else {

            makeToast("Good Job , t3ala kol youm");


            Random random = new Random();

            n = random.nextInt(20) + 1;

            // try to change the button text to play again

            // Button bt = (Button) findViewById(R.id.button);
            // bt.setText("Play Again");
        }
    }

    public void makeToast(String s){

        // fill the context section with just (this)

        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}
