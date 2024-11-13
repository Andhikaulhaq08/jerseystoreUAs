package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class lembaranke2 extends AppCompatActivity {

    private Button btnName, btnPhoneNumber, btnRegisterNow;

    // Predefined credentials for demonstration
    private final String correctUsername = "andhika";
    private final String correctPassword = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembaranke2);

        // Initialize components from the XML
        btnName = findViewById(R.id.myButton); // "Name" button
        btnPhoneNumber = findViewById(R.id.password); // "Phone Number" button
        btnRegisterNow = findViewById(R.id.myButton4); // "Register Now" button

        // Set up click listeners for the buttons
        btnRegisterNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Placeholder for registration logic
                Toast.makeText(lembaranke2.this, "Register button clicked", Toast.LENGTH_SHORT).show();
                // You can add an Intent here to navigate to a new Activity
            }
        });

        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(lembaranke2.this, "Name button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(lembaranke2.this, "Phone Number button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
