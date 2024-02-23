package com.example.viveantioquia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView btn_urrao;
    CardView btn_guatape;
    CardView btn_jardin;
    CardView btn_retiro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_urrao = findViewById(R.id.card_urrao_btn);
        btn_urrao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivity(1);
            }
        });

        btn_guatape = findViewById(R.id.card_guatape_btn);
        btn_guatape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivity(2);
            }
        });

        btn_jardin = findViewById(R.id.card_jardin_btn);
        btn_jardin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivity(3);
            }
        });

        btn_retiro = findViewById(R.id.card_retiro_btn);
        btn_retiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivity(4);
            }
        });
    }

    private void goToActivity(int option) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
        MenuActivity.option_fragment = option;
    }

}