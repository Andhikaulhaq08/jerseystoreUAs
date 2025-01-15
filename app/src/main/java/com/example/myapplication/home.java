package com.example.myapplication ;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Referensi ke ImageView
        ImageView acMilanHome = findViewById(R.id.myImageView3); // ID sesuai dengan XML
        ImageView acMilanAway = findViewById(R.id.myImageView6);
        ImageView bayermunchen = findViewById(R.id.myImageView2);
        ImageView acmilanthird = findViewById(R.id.myImageView5);

        // OnClickListener untuk gambar AC Milan Home
        acMilanHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman detail
                Intent intent = new Intent(home.this, acmilanhome.class);
                intent.putExtra("product_name", "AC Milan Home 2024/2025");
                startActivity(intent);
            }
        });

        // OnClickListener untuk gambar AC Milan Away
        acMilanAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman detail
                Intent intent = new Intent(home.this, acmilanaway.class);
                intent.putExtra("product_name", "AC Milan Away 2024/2025");
                startActivity(intent);
            }
        });
        bayermunchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman detail
                Intent intent = new Intent(home.this, check_out.class);
                intent.putExtra("product_name", "BAYER MUNCHEN 2024/2025");
                startActivity(intent);
            }
        });
        acmilanthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman detail
                Intent intent = new Intent(home.this, acmilanthird.class);
                intent.putExtra("product_name", "AC MILAN THIRD JERSEY 2024/2025");
                startActivity(intent);
            }
        });
    }
}
