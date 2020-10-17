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
import com.example.lab3.databinding.Task5F1Binding;

public class fragment1 extends Fragment {
    Task5F1Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = Task5F1Binding.inflate(inflater);
        binding.buttonActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(fragment1.this).navigate(R.id.action_fragment1_to_fragment2);
            }
        });
        return binding.getRoot();
    }
}
