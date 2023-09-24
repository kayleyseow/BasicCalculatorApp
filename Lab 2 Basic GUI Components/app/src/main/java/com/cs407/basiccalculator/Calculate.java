package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {

    TextView printResultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        printResultTextView=(TextView) findViewById(R.id.printResultTextView);
        Intent intent =getIntent();
        String str = intent.getStringExtra("message");
        printResultTextView.setText("Your result is "+str);
    }
}