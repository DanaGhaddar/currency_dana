package com.lau2022.currency_dana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userInput;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput =  (EditText) findViewById(R.id.userInput);
        result = (TextView) findViewById(R.id.result);
    }

    public void convertToUsd(View view){
        int amount = Integer.parseInt(userInput.getText().toString()) / 22000 ;
        result.setText(amount + "$");

    }

    public void convertToLbp(View v){
        int amount = Integer.parseInt(userInput.getText().toString()) * 22000 ;
        result.setText(amount+"LBP");
    }
}