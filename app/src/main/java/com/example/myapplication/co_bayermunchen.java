package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class co_bayermunchen extends AppCompatActivity {

    private EditText alamat;
    private Button btnBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.co_bayer);

        alamat = findViewById(R.id.alamat);
        btnBayar = findViewById(R.id.btnBayar);

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputAlamat = alamat.getText().toString().trim();

                if (inputAlamat.isEmpty()) {
                    alamat.setError("Alamat tidak boleh kosong");
                } else {
                    Intent intent = new Intent(co_bayermunchen.this, pembayaran1.class);
                    intent.putExtra("product_name", "Bayern Munchen Jersey 2024/2025"); // Ganti nama produk sesuai
                    intent.putExtra("alamat_pengiriman", inputAlamat);
                    startActivity(intent);
                }
            }
        });
    }
}
