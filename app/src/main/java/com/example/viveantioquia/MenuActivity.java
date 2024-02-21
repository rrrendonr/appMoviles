package com.example.viveantioquia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    DrawerLayout drawer_menu_main_layout;
    ImageButton button_menu_toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        drawer_menu_main_layout = findViewById(R.id.drawer_main_menu_layout);
        button_menu_toggle = findViewById(R.id.button_menu_toggle);

        button_menu_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer_menu_main_layout.open();
            }
        });


    }
}