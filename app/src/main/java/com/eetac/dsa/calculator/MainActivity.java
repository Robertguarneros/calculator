package com.eetac.dsa.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {
    TextView textViewOperation;
    TextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewOperation = (TextView) findViewById(R.id.textViewOperation);
        textViewResult = (TextView) findViewById(R.id.textViewResult);

    }

    public void clear(View view) {
    }

    public void sin(View view) {
    }

    public void tan(View view) {
    }

    public void cos(View view) {
    }

    public void divide(View view) {
    }

    public void seven(View view) {
    }

    public void eight(View view) {
    }
    public void one(View view) {
    }

    public void zero(View view) {
    }
}