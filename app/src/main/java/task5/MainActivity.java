package task5;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab3.databinding.MainActivityBinding;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {
    MainActivityBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                startActivity(new Intent(MainActivity.this, ActivityAbout.class));
                return true;
            }
        });
    }
}
