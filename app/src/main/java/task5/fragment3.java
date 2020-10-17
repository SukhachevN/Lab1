package task5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.lab3.R;
import com.example.lab3.databinding.Task5F3Binding;


public class fragment3 extends Fragment {
    Task5F3Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = Task5F3Binding.inflate(inflater);
        binding.buttonActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment3.this).navigate(R.id.action_fragment3_to_fragment1);
            }
        });
        binding.button2Activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment3.this).navigate(R.id.action_fragment3_to_fragment2);
            }
        });
        return binding.getRoot();
    }
}
