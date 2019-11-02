package com.sparrowpaul.cedisto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userInputEditText;
    Button convertButton;
    TextView resultTextView;
    double exchangeRate = 5.5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInputEditText = findViewById(R.id.cedisAmountID);
        convertButton = findViewById(R.id.convertButtonID);
        resultTextView = findViewById(R.id.resultID);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello AndroidTrain",Toast.LENGTH_LONG).show();
                double userAmount = Double.parseDouble(userInputEditText.getText().toString());
                double dollar = userAmount * exchangeRate;
                resultTextView.setText(String.valueOf(dollar));

            }
        });







    }
}
