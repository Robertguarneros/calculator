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

    public void nine(View view) {
    }

    public void multiply(View view) {
    }

    public void four(View view) {
    }

    public void five(View view) {
    }

    public void six(View view) {
    }

    public void subtract(View view) {
    }

    public void two(View view) {
    }

    public void three(View view) {
    }

    public void add(View view) {
    }

    public void dot(View view) {
    }

    public void delete(View view) {
    }

    public void equal(View view) {
    }
}