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
import com.example.lab3.databinding.Task5F2Binding;

public class fragment2 extends Fragment {
    Task5F2Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = Task5F2Binding.inflate(inflater);
        binding.buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment2.this).navigate(R.id.action_fragment2_to_fragment1);
            }
        });
        binding.button2Activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment2.this).navigate(R.id.action_fragment2_to_fragment3);
            }
        });
        return binding.getRoot();
    }
}
