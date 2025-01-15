package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class acmilanhome_co extends AppCompatActivity {

    private EditText alamat1;
    private Button btnLogin1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.co_acmilanhome);

        alamat1 = findViewById(R.id.alamat1);
        btnLogin1 = findViewById(R.id.btnLogin1);

        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk pindah ke halaman checkout
                Intent intent = new Intent(acmilanhome_co.this, pembayaran1.class); // Ganti dengan activity tujuan
                intent.putExtra("product_name", "AC Milan HOME Jersey 2024/2025");
                startActivity(intent);
            }
        });

    }
}