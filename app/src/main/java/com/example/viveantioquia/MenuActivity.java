package com.example.viveantioquia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MenuActivity extends AppCompatActivity {

    DrawerLayout drawer_menu_main_layout;
    ImageButton button_menu_toggle;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        drawer_menu_main_layout = findViewById(R.id.drawer_main_menu_layout);
        button_menu_toggle = findViewById(R.id.button_menu_toggle);
        navigationView = findViewById(R.id.navigation_view);

        button_menu_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer_menu_main_layout.open();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();

                if (itemId == R.id.home_btn) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }

                if (itemId == R.id.urrao_btn) {
                    navToFragment(new Fragment(R.layout.fragmen_urrao));
                }

                if (itemId == R.id.guatape_btn) {
                    navToFragment(new Fragment(R.layout.fragmen_guatape));
                }

                if (itemId == R.id.jardin_btn) {
                    navToFragment(new Fragment(R.layout.fragmen_jardin));
                }

                if (itemId == R.id.retiro_btn) {
                    navToFragment(new Fragment(R.layout.fragmen_retiro));
                }
                drawer_menu_main_layout.close();
                return false;
            }
        });
    }

    private void navToFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout, fragment).commit();
    }
}