package com.example.cricketchirpsthermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etChirps;
    Button btnCalculate;
    TextView tvResult;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etChirps = findViewById(R.id.etChirps);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String sChirps = etChirps.getText().toString().trim();

                int iChirps = Integer.parseInt(sChirps);

                float temp = (iChirps/3) + 4;

                String sTemp = String.valueOf(temp);

                tvResult.setText("The temperature is " + sTemp);


            }
        });
    }
}
