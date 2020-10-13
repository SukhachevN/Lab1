package com.example.lab3.task2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab3.databinding.Task2Activity2Binding;
import com.google.android.material.navigation.NavigationView;

public class Activity2 extends AppCompatActivity {
    private final static String TAG = "Activity2";
    Task2Activity2Binding binding;
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
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
                startActivityForResult(new Intent(Activity2.this, Activity3.class), 2);
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
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==1){
            finish();
        }
    }
}
