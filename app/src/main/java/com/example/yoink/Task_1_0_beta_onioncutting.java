package com.example.yoink;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.yoink.databinding.FragmentDummytaskBinding;


public class Task_1_0_beta_onioncutting extends Fragment {

    private FragmentDummytaskBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentDummytaskBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.back_button: NavHostFragment.findNavController(Task_1_0_beta_onioncutting.this)
                            .navigate(R.id.action_DummyTaskFragment_to_BeginnersFragment);
                }}
        });

        binding.completeChallengeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.complete_challenge_button:
                        view.setBackgroundColor(Color.GREEN);
                        Button button = (Button) view;
                        button.setText("Challenge Completed!");
                }
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}