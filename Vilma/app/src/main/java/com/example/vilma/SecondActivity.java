package com.example.vilma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        backButton = findViewById(R.id.buttonback);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    final ImageButton button = findViewById(R.id.buttonthird);
        button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent switchActivityIntent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(switchActivityIntent);
        }
        });
}
}
