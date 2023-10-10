package com.eetac.dsa.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.Math;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    TextView textViewOperation;
    TextView textViewResult;

    private StringBuilder inputExpression = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewOperation = findViewById(R.id.textViewOperation);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void dot(View view) {
        inputExpression.append(".");
        textViewOperation.append(".");
    }

    public void zero(View view) {
        inputExpression.append("0");
        textViewOperation.append("0");
    }

    public void one(View view) {
        inputExpression.append("1");
        textViewOperation.append("1");
    }

    public void two(View view) {
        inputExpression.append("2");
        textViewOperation.append("2");
    }

    public void three(View view) {
        inputExpression.append("3");
        textViewOperation.append("3");
    }

    public void four(View view) {
        inputExpression.append("4");
        textViewOperation.append("4");
    }

    public void five(View view) {
        inputExpression.append("5");
        textViewOperation.append("5");
    }

    public void six(View view) {
        inputExpression.append("6");
        textViewOperation.append("6");
    }

    public void seven(View view) {
        inputExpression.append("7");
        textViewOperation.append("7");
    }

    public void eight(View view) {
        inputExpression.append("8");
        textViewOperation.append("8");
    }

    public void nine(View view) {
        inputExpression.append("9");
        textViewOperation.append("9");
    }

    public void clear(View view) {
        textViewOperation.setText("");
        textViewResult.setText("");
        inputExpression.setLength(0);
    }

    public void sin(View view) {
        inputExpression.append("sin");
        textViewOperation.append("sin");
    }

    public void tan(View view) {
        inputExpression.append("tan");
        textViewOperation.append("tan");
    }

    public void cos(View view) {
        inputExpression.append("cos");
        textViewOperation.append("cos");
    }

    public void divide(View view) {
        inputExpression.append("/");
        textViewOperation.append("/");
    }

    public void multiply(View view) {
        inputExpression.append("*");
        textViewOperation.append("*");
    }

    public void subtract(View view) {
        inputExpression.append("-");
        textViewOperation.append("-");
    }

    public void add(View view) {
        inputExpression.append("+");
        textViewOperation.append("+");
    }

    public void delete(View view) {
        if (inputExpression.length() > 0) {
            inputExpression.deleteCharAt(inputExpression.length() - 1);
            textViewOperation.setText(inputExpression.toString());
        }
    }
    public void equal(View view) {

    }
}
