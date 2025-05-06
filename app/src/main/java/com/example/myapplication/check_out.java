package com.example.myapplication; // Sesuaikan dengan nama package aplikasi Anda

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class check_out extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out); // Pastikan nama layout sesuai dengan file XML Anda

        // Inisialisasi komponen dari XML
        TextView headerText = findViewById(R.id.headerText);
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textViewSubtotal = findViewById(R.id.textViewSubtotal);
        TextView textViewTotal = findViewById(R.id.textViewTotal);
        Button myButton = findViewById(R.id.myButton);  // Tombol "ADD TO CART"
        ImageView myImageView1 = findViewById(R.id.myImageView1); // Gambar utama jersey

        // Set Text pada TextView
        headerText.setText("Jersey Store");
        textView1.setText("STADIUM COLLECTION");
        textView3.setText("UCL Men's third jersey 24/25 FC Barcelona");
        textView2.setText("Rp 120.000");
        textViewSubtotal.setText("Subtotal");
        textViewTotal.setText("Rp 120.000");

        // Aksi klik untuk tombol "ADD TO CART"
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk pindah ke halaman checkout (misalnya co_bayermunchen.class)
                Intent intent = new Intent(check_out.this, co_bayermunchen.class); // Ganti dengan activity tujuan
                intent.putExtra("product_name", "UCL Men's third jersey 24/25 FC Barcelona");
                intent.putExtra("product_price", "Rp 120.000");
                startActivity(intent);
            }
        });

        // Aksi klik untuk ImageView utama (gambar jersey)
        myImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tampilkan Toast saat gambar diklik
                Toast.makeText(check_out.this, "Main Jersey Image Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
