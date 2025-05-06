package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class acmilanhome_co extends AppCompatActivity {

    private EditText alamat;
    private Button btnBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.co_acmilanhome); // pastikan layout ini cocok dengan XML kamu

        alamat = findViewById(R.id.alamat);
        btnBayar = findViewById(R.id.btnBayar);

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cek jika alamat kosong
                String alamatInput = alamat.getText().toString().trim();
                if (alamatInput.isEmpty()) {
                    alamat.setError("Alamat tidak boleh kosong");
                    alamat.requestFocus();
                    return;
                }

                // Intent untuk pindah ke halaman checkout
                Intent intent = new Intent(acmilanhome_co.this, pembayaran1.class);
                intent.putExtra("product_name", "AC Milan HOME Jersey 2024/2025");
                intent.putExtra("alamat", alamatInput);
                startActivity(intent);
            }
        });
    }
}
