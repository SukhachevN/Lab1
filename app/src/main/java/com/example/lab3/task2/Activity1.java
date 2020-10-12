package com.example.lab3.task2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.lab3.R.layout.*;
import static com.example.lab3.R.*;

public class Activity1 extends AppCompatActivity implements View.OnClickListener {
    Button btnName;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(task2_activity1);
        btnName = (Button) findViewById(id.buttonActivity1);
        btnName.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivityForResult(intent, 1);
    }
}
