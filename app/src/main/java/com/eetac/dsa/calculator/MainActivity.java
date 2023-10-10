package com.eetac.dsa.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.Math;
import java.util.Arrays;
import java.util.Stack;
import android.util.Log;
import java.text.DecimalFormat;

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
    // ...
    public void equal(View view) {
        String expression = inputExpression.toString();

        // Tokenize the expression
        String[] tokens = expression.split("(?<=[+\\-*/()])|(?=[+\\-*/()])|(?<=sin)|(?=sin)|(?<=cos)|(?=cos)|(?<=tan)|(?=tan)");

        Stack<Double> operandStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("[0-9.]+")) {
                // Token is a number, push it onto the operand stack
                operandStack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                // Token is an operator
                while (!operatorStack.isEmpty() && hasHigherPrecedence(operatorStack.peek(), token)) {
                    // Pop operands and perform the operation
                    double operand2 = operandStack.pop();
                    double operand1 = operandStack.pop();
                    String operator = operatorStack.pop();
                    double result = performOperation(operand1, operand2, operator);

                    // Push the result back onto the operand stack
                    operandStack.push(result);
                }
                // Push the current operator onto the operator stack
                operatorStack.push(token);
            } else if (token.equals("sin") || token.equals("cos") || token.equals("tan")) {
                // Token is a trigonometric function
                operatorStack.push(token);
                // Push a default value onto the operand stack
                operandStack.push(0.0);
            }
        }

        // Evaluate any remaining operators
        while (!operatorStack.isEmpty()) {
            double operand2 = operandStack.pop();
            double operand1 = operandStack.pop();
            String operator = operatorStack.pop();
            double result = performOperation(operand1, operand2, operator);
            operandStack.push(result);
        }

        // The final result should be on the operand stack
        if (!operandStack.isEmpty()) {
            double finalResult = operandStack.pop();
            textViewResult.setText(String.valueOf(finalResult));
        }
    }

    private boolean isOperator(String token) {
        return token.matches("[+\\-*/]");
    }

    private boolean hasHigherPrecedence(String operator1, String operator2) {
        return (operator1.equals("*") || operator1.equals("/")) && (operator2.equals("+") || operator2.equals("-"));
    }

    private double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    // Handle division by zero
                    return Double.NaN;
                }
            case "sin":
                // Convert degrees to radians and calculate sine
                return Math.sin(Math.toRadians(operand2));
            case "cos":
                // Convert degrees to radians and calculate cosine
                return Math.cos(Math.toRadians(operand2));
            case "tan":
                // Convert degrees to radians and calculate tangent
                return Math.tan(Math.toRadians(operand2));
            default:
                return 0;
        }
    }


}
