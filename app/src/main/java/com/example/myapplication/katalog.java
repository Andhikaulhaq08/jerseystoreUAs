package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class katalog extends AppCompatActivity {

    private Button btnLookingFor;
    private ImageView imgACMilanHome, imgACMilanAway, imgBayerMunchen, imgACMilanHome2025;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Pastikan nama file XML sesuai dengan layout Anda

        // Inisialisasi komponen
        btnLookingFor = findViewById(R.id.myButton);
        imgACMilanHome = findViewById(R.id.myImageView3);
        imgACMilanAway = findViewById(R.id.myImageView6);
        imgBayerMunchen = findViewById(R.id.myImageView2);
        imgACMilanHome2025 = findViewById(R.id.myImageView5);

        // Set klik listener untuk tombol "I am Looking For"
        btnLookingFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(katalog.this, "Looking for items!", Toast.LENGTH_SHORT).show();
                // Contoh: Navigasi ke halaman pencarian
                Intent intent = new Intent(katalog.this, home.class); // Ganti dengan Activity Anda
                startActivity(intent);
            }
        });

        // Klik listener untuk gambar AC Milan Home
        imgACMilanHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(katalog.this, "AC Milan Home 2024/2025 clicked!", Toast.LENGTH_SHORT).show();
                // Contoh: Navigasi ke detail produk
                Intent intent = new Intent(katalog.this, home.class); // Ganti dengan Activity Anda
                intent.putExtra("productName", "AC Milan Home 2024/2025");
                startActivity(intent);
            }
        });

        // Klik listener untuk gambar AC Milan Away
        imgACMilanAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(katalog.this, "AC Milan Away 2024/2025 clicked!", Toast.LENGTH_SHORT).show();
                // Contoh: Navigasi ke detail produk
                Intent intent = new Intent(katalog.this, home.class); // Ganti dengan Activity Anda
                intent.putExtra("productName", "AC Milan Away 2024/2025");
                startActivity(intent);
            }
        });

        // Klik listener untuk gambar Bayer Munchen
        imgBayerMunchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(katalog.this, "Bayer Munchen 2024/2025 clicked!", Toast.LENGTH_SHORT).show();
                // Contoh: Navigasi ke detail produk
                Intent intent = new Intent(katalog.this, home.class); // Ganti dengan Activity Anda
                intent.putExtra("productName", "Bayer Munchen 2024/2025");
                startActivity(intent);
            }
        });

        // Klik listener untuk gambar AC Milan Home 2025
        imgACMilanHome2025.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(katalog.this, "AC Milan Home 2025 clicked!", Toast.LENGTH_SHORT).show();
                // Contoh: Navigasi ke detail produk
                Intent intent = new Intent(katalog.this, home.class); // Ganti dengan Activity Anda
                intent.putExtra("productName", "AC Milan Home 2025");
                startActivity(intent);
            }
        });
    }
}
