package com.example.myapplication; // Sesuaikan dengan nama package aplikasi Anda

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class acmilanthird extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acmilanthird); // Pastikan nama layout sesuai dengan file XML Anda

        // Inisialisasi tombol dan imageView
        Button myButton = findViewById(R.id.myButton);
        ImageView myImageView1 = findViewById(R.id.myImageView1);

        // Aksi klik untuk tombol "ADD TO CART"
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk pindah ke halaman checkout
                Intent intent = new Intent(acmilanthird.this, lembarke4.class); // Ganti dengan activity tujuan
                intent.putExtra("product_name", "AC Milan Third Jersey 2024/2025");
                startActivity(intent);
            }
        });

        // Aksi klik untuk ImageView1
        myImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(acmilanthird.this, "Main Jersey Image Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
