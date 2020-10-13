package com.example.lab3.task2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab3.databinding.Task2Activity2Binding;
import com.google.android.material.navigation.NavigationView;


public class Activity2 extends AppCompatActivity {
    Task2Activity2Binding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Task2Activity2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.button2Activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(Activity2.this, Activity3.class), 1);
            }
        });
        binding.navView2.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                startActivity(new Intent(Activity2.this, ActivityAbout.class));
                return true;
            }
        });
    }
}
