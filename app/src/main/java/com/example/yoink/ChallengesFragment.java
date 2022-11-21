package com.example.yoink;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.yoink.databinding.FragmentChallengesBinding;

public class ChallengesFragment extends Fragment {

    private FragmentChallengesBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentChallengesBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ChallengesFragment.this)
                        .navigate(R.id.action_ChallengesFragment_to_SecondFragment);

            }
        });

        binding.buttonBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ChallengesFragment.this)
                        .navigate(R.id.action_ChallengesFragment_to_BeginnerFragment);
            }
        });
        binding.buttonIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ChallengesFragment.this)
                        .navigate(R.id.action_ChallengesFragment_to_IntermediateFragment);
            }
        });
        binding.buttonAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ChallengesFragment.this)
                        .navigate(R.id.action_ChallengesFragment_to_AdvancedFragment);
            }
        });
        binding.buttonPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ChallengesFragment.this)
                        .navigate(R.id.action_ChallengesFragment_to_ProFragment);
            }
        });
        binding.buttonChef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ChallengesFragment.this)
                        .navigate(R.id.action_ChallengesFragment_to_ChefFragment);
            }
        });


    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}