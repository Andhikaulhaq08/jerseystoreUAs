package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class acmilanaway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acmilanaway); // Pastikan nama file XML adalah acmilanaway.xml

        // Inisialisasi tombol dan imageView
        Button myButton = findViewById(R.id.myButton);
        ImageView myImageView1 = findViewById(R.id.myImageView1);

        // Tombol ADD TO CART
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(acmilanaway.this, co_awayacmilan.class); // Activity tujuan
                intent.putExtra("product_name", "AC Milan AWAY Jersey 2024/2025");
                startActivity(intent);
            }
        });

        // Klik gambar jersey
        myImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(acmilanaway.this, "Jersey Image Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
