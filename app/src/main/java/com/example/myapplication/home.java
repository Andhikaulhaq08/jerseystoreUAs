package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    private EditText searchEditText;
    private List<LinearLayout> itemList = new ArrayList<>();
    private List<String> productNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        searchEditText = findViewById(R.id.searchEditText);

        // Inisialisasi semua item LinearLayout
        LinearLayout item1 = findViewById(R.id.item1);
        LinearLayout item2 = findViewById(R.id.item2);
        LinearLayout item3 = findViewById(R.id.item3);
        LinearLayout item4 = findViewById(R.id.item4);
        LinearLayout item5 = findViewById(R.id.item5);
        LinearLayout item6 = findViewById(R.id.item6);

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        // Inisialisasi semua nama produk
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);

        productNames.add(textView1.getText().toString());
        productNames.add(textView2.getText().toString());
        productNames.add(textView3.getText().toString());
        productNames.add(textView4.getText().toString());
        productNames.add(textView5.getText().toString());
        productNames.add(textView6.getText().toString());

        // Inisialisasi semua ImageView dan set onClick
        ImageView acMilanHome = findViewById(R.id.myImageView1);
        ImageView acMilanAway = findViewById(R.id.myImageView2);
        ImageView bayerMunchenAway = findViewById(R.id.myImageView3);
        ImageView manUtdHome = findViewById(R.id.myImageView4);
        ImageView liverpoolThird = findViewById(R.id.myImageView5);
        ImageView psgHome = findViewById(R.id.myImageView6);

        acMilanHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, acmilanhome.class);
                intent.putExtra("product_name", "AC Milan Home 2024/2025");
                startActivity(intent);
            }
        });

        acMilanAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, acmilanaway.class);
                intent.putExtra("product_name", "AC Milan Away 2024/2025");
                startActivity(intent);
            }
        });

        bayerMunchenAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, check_out.class);
                intent.putExtra("product_name", "Bayer Munchen Away 2024/2025");
                startActivity(intent);
            }
        });

        manUtdHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, acmilanhome.class);
                intent.putExtra("product_name", "Man Utd Home 2024/2025");
                startActivity(intent);
            }
        });

        liverpoolThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, acmilanthird.class);
                intent.putExtra("product_name", "Liverpool Third 2024/2025");
                startActivity(intent);
            }
        });

        psgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, acmilanhome.class);
                intent.putExtra("product_name", "PSG Home 2024/2025");
                startActivity(intent);
            }
        });

        // Buat fitur Searchbar
        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                filterItems(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // kosong
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // kosong
            }
        });
    }

    private void filterItems(String query) {
        for (int i = 0; i < itemList.size(); i++) {
            if (productNames.get(i).toLowerCase().contains(query.toLowerCase())) {
                itemList.get(i).setVisibility(View.VISIBLE);
            } else {
                itemList.get(i).setVisibility(View.GONE);
            }
        }
    }
}
