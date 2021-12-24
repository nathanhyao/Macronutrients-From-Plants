package com.example.plantbased1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BenefitsCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benefits_calculator);

        LinearLayout menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        });

        LinearLayout calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText years = findViewById(R.id.years);
                EditText months = findViewById(R.id.months);

                TextView animalsSaved = findViewById(R.id.animalsSaved);
                TextView carbonDioxideSaved = findViewById(R.id.carbonDioxideSaved);
                TextView forestSaved = findViewById(R.id.forestSaved);
                TextView grainSaved = findViewById(R.id.grainSaved);
                TextView waterSaved = findViewById(R.id.waterSaved);
                TextView status = findViewById(R.id.status);

                double numYears;
                double numMonths;
                if (years.getText().toString().length() > 0) {
                    numYears = Double.parseDouble(years.getText().toString());
                } else {
                    numYears = 0.0;
                }

                //CAREFUL: CHANGE ALL RELEVANT WORDs WHEN COPY PASTE (months vs years)
                if (months.getText().toString().length() > 0) {
                    numMonths = Double.parseDouble(months.getText().toString());
                } else {
                    numMonths = 0.0;
                }

                //CHANGE toString(SAVED RESULT) and NAME SAVED.setText
                double animalsSavedResult = (numYears*283.5) + (numMonths*23.5);
                animalsSaved.setText(Math.round(animalsSavedResult) + "+");

                double carbonDioxideSavedResult = (numYears*4522.5) + (numMonths*377.0);
                carbonDioxideSaved.setText(Math.round(carbonDioxideSavedResult) + "+");

                double forestSavedResult = (numYears*8510.4) + (numMonths*715.2);
                forestSaved.setText(Math.round(forestSavedResult) + "+");

                double grainSavedResult = (numYears*12766.0) + (numMonths*1073.2);
                grainSaved.setText(Math.round(grainSavedResult) + "+");

                double waterSavedResult = (numYears*312056.6) + (numMonths*26226.8);
                waterSaved.setText(Math.round(waterSavedResult) + "+");

                if (animalsSavedResult > 0 && animalsSavedResult <= 70) {
                    status.setText("Good!");
                } else if (animalsSavedResult > 70 && animalsSavedResult <=140) {
                    status.setText("Nice!");
                } else if (animalsSavedResult > 140 && animalsSavedResult <=210) {
                    status.setText("Great!");
                } else if (animalsSavedResult > 210) {
                    status.setText("Wow!");
                } else {
                    status.setText("Sad Cow");
                }
            } // end of onClick
        });
    }
}
