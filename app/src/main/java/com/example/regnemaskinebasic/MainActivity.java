package com.example.regnemaskinebasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void calculateNumber(View v) {
        Button currentButton = (Button) v;
        EditText firstNumber = findViewById(R.id.firstInput);
        EditText secondNumber = findViewById(R.id.secondInput);

        if (firstNumber.getText().toString().length() != 0 && secondNumber.getText().toString().length() != 0){
            TextView resultText = findViewById(R.id.result);
            double firstInput = Double.parseDouble(firstNumber.getText().toString());
            double secondInput = Double.parseDouble(secondNumber.getText().toString());

            if (currentButton.getText().toString().contains("+")) {
                double result = firstInput + secondInput;
                resultText.setText(String.valueOf(result));
            }
            else if (currentButton.getText().toString().contains("-")) {
                double result = firstInput - secondInput;
                resultText.setText(String.valueOf(result));

            }
            else if (currentButton.getText().toString().contains("/")) {
                double result = firstInput / secondInput;
                resultText.setText(String.valueOf(result));

            }
            else if (currentButton.getText().toString().contains("*")) {
                double result = firstInput * secondInput;
                resultText.setText(String.valueOf(result));

            }
        }

    }

    public void calculateResult(){

    }
}