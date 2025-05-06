package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class acmilanhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acmilan_home); // Nama layout XML-nya harus acmilan_home.xml

        // Inisialisasi tombol dan imageView
        Button myButton = findViewById(R.id.myButton);
        ImageView myImageView1 = findViewById(R.id.myImageView1);

        // Aksi klik untuk tombol "ADD TO CART"
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(acmilanhome.this, acmilanhome_co.class);
                intent.putExtra("product_name", "AC Milan Third Jersey 2024/2025");
                startActivity(intent);
            }
        });

        // Aksi klik untuk gambar utama
        myImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(acmilanhome.this, "Main Jersey Image Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
