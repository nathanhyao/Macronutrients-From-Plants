package com.example.plantbased1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout globalBenefitsButton = findViewById(R.id.globalBenefitsButton);
        globalBenefitsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), GlobalBenefits.class);
                startActivity(startIntent);
            }
        });

        LinearLayout benefitsCalculatorButton = findViewById(R.id.benefitsCalculatorButton);
        benefitsCalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), BenefitsCalculator.class);
                startActivity(startIntent);
            }
        });

        LinearLayout carbSourcesButton = findViewById(R.id.carbSourcesButton);
        carbSourcesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), CarbSources.class);
                startActivity(startIntent);
            }
        });

        LinearLayout proteinSourcesButton = findViewById(R.id.proteinSourcesButton);
        proteinSourcesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ProteinSources.class);
                startActivity(startIntent);
            }
        });

        LinearLayout fatSourcesButton = findViewById(R.id.fatSourcesButton);
        fatSourcesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), FatSources.class);
                startActivity(startIntent);
            }
        });

        LinearLayout fiberSourcesButton = findViewById(R.id.fiberSourcesButton);
        fiberSourcesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), FiberSources.class);
                startActivity(startIntent);
            }
        });

    }
}
