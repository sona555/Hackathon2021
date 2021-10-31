package com.example.vilma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton button = findViewById(R.id.buttonglaube);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 Intent switchActivityIntent = new Intent(MainActivity.this, SecondActivity.class);
                 startActivity(switchActivityIntent);
            }
        });
    }
}