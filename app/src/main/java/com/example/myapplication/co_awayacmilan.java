package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class co_awayacmilan extends AppCompatActivity {

    private EditText alamat;
    private Button btnBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.co_acmilanaway); // Pastikan layout XML sesuai

        // Inisialisasi komponen
        alamat = findViewById(R.id.alamat); // Pastikan ID EditText di XML adalah "alamat"
        btnBayar = findViewById(R.id.btnBayar); // ID tombol dari XML

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputAlamat = alamat.getText().toString().trim();

                if (inputAlamat.isEmpty()) {
                    Toast.makeText(co_awayacmilan.this, "Alamat tidak boleh kosong", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Pindah ke activity pembayaran
                Intent intent = new Intent(co_awayacmilan.this, pembayaran1.class);
                intent.putExtra("product_name", "AC Milan Away Jersey 2024/2025");
                intent.putExtra("harga", 120000);
                intent.putExtra("alamat", inputAlamat);
                startActivity(intent);
            }
        });
    }
}
