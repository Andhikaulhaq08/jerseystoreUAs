package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class lembarke4 extends AppCompatActivity {

    private EditText alamat;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment1);

        alamat = findViewById(R.id.alamat);
        btnLogin = findViewById(R.id.btnBayar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk pindah ke halaman checkout
                Intent intent = new Intent(lembarke4.this, pembayaran1.class); // Ganti dengan activity tujuan
                intent.putExtra("product_name", "AC Milan Third Jersey 2024/2025");
                startActivity(intent);
            }
        });

    }
}