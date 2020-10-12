package com.example.lab3.task2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab3.R;

import static com.example.lab3.R.layout.task2_activity3;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {
    Button btnName;
    Button btnName2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(task2_activity3);
        btnName = (Button) findViewById(R.id.buttonActivity3);
        btnName.setOnClickListener(this);
        btnName2 = (Button) findViewById(R.id.button2Activity3);
        btnName2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.buttonActivity3:
                intent= new Intent(this, Activity1.class);
                break;
            case R.id.button2Activity3:
                intent= new Intent(this, Activity2.class);
                break;
        }
        startActivityForResult(intent, 1);
    }
}
